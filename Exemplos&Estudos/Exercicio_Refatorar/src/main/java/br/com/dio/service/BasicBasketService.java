package br.com.dio.service;
import br.com.dio.BasicBasket;
import br.com.dio.Box;
import br.com.dio.dao.StockDAO;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

public class BasicBasketService {
    // Declaração de atributos privados e constantes para as dependências da classe
    private final StockDAO dao;
    private final MoneyService moneyService;
    // Construtor da classe BasicBasketService, usado para Injeção de Dependência das classes necessárias
    public BasicBasketService(final StockDAO dao, final MoneyService moneyService) {
        this.dao = dao;
        this.moneyService = moneyService;
    }

    public List<BasicBasket> receive(final Box box){
        // Novo Metodo público de Lista chamado receive que recebe um obj
        // 'box' criado da classe Box.java e retorna uma Lista de BasicBasket
        var finalPrice = box.finalPrice(); //executa o metodo finalPrice() do obj box para obter o preço final calculado
        var baskets= Stream.generate(() ->
                new BasicBasket(box.validate(), finalPrice)) // Criação de uma stream usando a validade(data) e preço final
                .limit(box.amount()) // limita a criação da stream pelo número de itens existentes
                .toList(); // Termina a criação da stream e retorna uma Lista.
        return dao.addBatch(baskets); // Executa o metodo addBatch do obj dao
        // salvando a lista(baskets) no banco de dados
        // e retorna o resultado
    }

    public BigDecimal sold(final int amount){ //Metodo público 'sold'
        var toSold =  dao.remove(amount); // Atribui a quantidade de itens que serão removidos na variável toSold.
        var total = toSold.stream().map(BasicBasket::price).reduce(BigDecimal.ZERO, BigDecimal::add);
        // Criação do total = pega a quantidade atribuida, cria um stream de map, que será acrescido(somatório) do preço (BasicBasket::price
        // pela quantidade de itens adicionados .reduce(BD.ZERO , BD::add);
        moneyService.add(total); // adiciona o valor total a classe MoneyService
        return total; //retorna a quantia vendidas
    }
}
