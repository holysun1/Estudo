package br.com.dio.dao;

import br.com.dio.BasicBasket;
import br.com.dio.model.StockInfo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class StockDAO  {

    private static final List<BasicBasket> stock = new ArrayList<>();


    public List<BasicBasket> addBatch(final List<BasicBasket> baskets){
        stock.addAll(baskets);
        return stock;
    }
    public List<BasicBasket> removeBatch(final List<BasicBasket> baskets){
        stock.removeAll(baskets);
        return stock;
    }
    public List<BasicBasket> remove(final int amount){
        int actualAmount = Math.min(amount, stock.size());
        stock.sort(Comparator.comparing(BasicBasket::price));
        List<BasicBasket> removed = new ArrayList<>(stock.subList(0, actualAmount));
        stock.subList(0, actualAmount).clear(); // Apaga do estoque
        return removed;
    }

    public static List<BasicBasket> removeExpired() {
        List<BasicBasket> expiredBaskets = stock.stream()
                .filter(b -> b.validate().isBefore(LocalDate.now()))
                .toList();
        stock.removeAll(expiredBaskets); // Remove do estoque real
        return expiredBaskets; // Retorna o que foi removido para o Service calcular o prejuízo
    }

    public StockInfo getInfo(){
        return new StockInfo(stock.size(), stock.stream().filter(b -> b.validate().isBefore(LocalDate.now())).count());
    }

}

