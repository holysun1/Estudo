package br.com.dio.service;

import br.com.dio.dao.MoneyDAO;

import java.math.BigDecimal;

public class MoneyService {
    private final MoneyDAO dao;

    public MoneyService(MoneyDAO dao) {
        this.dao = dao;
    }

    public BigDecimal add(final BigDecimal money){
        return dao.add(money);
    }
    public void checkMoney(){
        System.out.printf("O caixa no momento é de %s\n", dao.getMoney());
    }
}
