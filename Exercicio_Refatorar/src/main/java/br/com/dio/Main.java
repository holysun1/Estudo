package br.com.dio;

import br.com.dio.dao.MoneyDAO;
import br.com.dio.dao.StockDAO;
import br.com.dio.service.BasicBasketService;
import br.com.dio.service.MoneyService;
import br.com.dio.service.StockService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    //Declaração de atributos privados e constantes para as dependencias de classe
    private static final StockDAO stockDAO = new StockDAO();
    private static final MoneyDAO moneyDAO = new MoneyDAO();
    //Criação dos Serviços injetando os seus respectivos DAOs
    private static final MoneyService moneyService = new MoneyService(moneyDAO);
    private static final StockService stockService = new StockService(stockDAO);
    private static final BasicBasketService basicBasketService = new BasicBasketService(stockDAO,moneyService); //Injeção de Dependência via Construtor

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema de armazém");
        System.out.println("Selecione a opção desejada");
        var option = -1;
        while (true){
            System.out.println("1 - Verificar estoque de cesta básica");
            System.out.println("2 - Verificar caixa");
            System.out.println("3 - Receber Cestas");
            System.out.println("4 - Vender Cestas");
            System.out.println("5 - Remover itens vencidos");
            System.out.println("6 - Sair\n");
            option = scanner.nextInt();
            switch (option){
                case 1 -> stockService.checkStock();
                case 2 -> moneyService.checkMoney();
                case 3 -> receiveItems();
                case 4 -> soldItems();
                case 5 -> stockService.removeItemsOutOfDate();
                case 6 -> System.exit(0);
                default -> System.out.println("Opção Inválida, escolha uma das opções informadas no menu");
            }
        }
    }

    private static void soldItems() {
        System.out.println("Quantas cestas serão vendidas");
        var amount = scanner.nextInt();
        var total = basicBasketService.sold(amount);
        System.out.printf("O valor da venda é de %s \n", total);
    }

    private static void receiveItems(){
        System.out.println("Informe o valor da entrega");
        var price = scanner.nextBigDecimal();
        System.out.println("Informe a quantidade de cestas da entrega");
        var amount = scanner.nextLong();
        System.out.println("Informe a data de vencimento");
        var validateInput = scanner.next();
        var formatter = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate validate = LocalDate.parse(validateInput, formatter);
        var box = new Box(amount, validate, price);
        var baskets = basicBasketService.receive(box);
        System.out.printf("Foram adicionadas %s cestas ao estoque\n", baskets.size());
    }

}
