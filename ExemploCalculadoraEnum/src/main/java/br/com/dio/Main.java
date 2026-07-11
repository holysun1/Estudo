package br.com.dio;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {

            System.out.println("1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão");
            System.out.print("Opção: ");
            var opcao = scanner.nextInt();

            Operacao.obterPorOpcao(opcao)
                    .ifPresentOrElse(
                            operacao -> {
                                try {
                                    System.out.print("Digite o primeiro valor (use ponto para decimais): ");
                                    var primeiroValor = new BigDecimal(scanner.next());

                                    System.out.print("Digite o segundo valor (use ponto para decimais): ");
                                    var segundoValor = new BigDecimal(scanner.next());

                                    BigDecimal resultado = operacao.executar(primeiroValor, segundoValor);
                                    System.out.println("\n" + primeiroValor + " " + operacao.getSimbolo() + " " + segundoValor + " = " + resultado );

                                } catch (NumberFormatException e) {
                                    System.out.println("\nErro: Formato de número inválido. Use o ponto (.) como separador.\n");
                                } catch (ArithmeticException e) {
                                    System.out.println("\nErro matemático: " + e.getMessage() + "\n");
                                }
                            },
                            () -> System.out.println("\nErro: Opção de menu inválida!\n")
                    );

        } catch (InputMismatchException e) {
            System.out.println("\nErro: Você deve digitar um número inteiro para a opção do menu.\n");
        }

        System.out.println("====== Obrigado ======");
    }
}