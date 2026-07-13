package br.com.dio.service;

import br.com.dio.BasicBasket;
import br.com.dio.dao.StockDAO;
import br.com.dio.model.StockInfo;

import java.math.BigDecimal;
import java.util.List;

public class StockService  {

    private final StockDAO dao;

    public StockService(final StockDAO dao) {
        this.dao = dao;
    }

    public void checkStock() {
        StockInfo info = dao.getInfo();
        System.out.printf("Existem %s cestas em estoque, das quais %s estão fora do prazo de validade \n", info.total(), info.outOfDate());
    }

    public void removeItemsOutOfDate(){
        // O DAO remove do estoque e nos devolve a lista do que foi jogado fora
        List<BasicBasket> outOfDate = dao.removeExpired();

        // Calcula o prejuízo somando o preço das cestas que foram removidas
        BigDecimal lost = outOfDate.stream()
                .map(BasicBasket::price)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.printf("Foram descartadas do estoque %d cestas vencidas, o prejuizo foi de %s \n",
                outOfDate.size(), lost);
    }
}
