package br.com.dio;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //try with resources garante o fechamento do Scanner automaticamente
        try (var scanner = new Scanner(System.in)) {
            int operationOption = 0;
            while (operationOption == 0 || operationOption > 4) {
                System.out.println("Digite o numero da operação: 1 - Adição // 2 - Subtração // 3 - Multiplicação // 4 - Divisão ");
                try {
                    operationOption = scanner.nextInt();
                    if (operationOption < 1 || operationOption > 4) {
                        System.out.println("Por favor, digite apenas números inteiros entre 1 a 4.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite apenas números inteiros entre 1 a 4.");
                    scanner.nextLine(); //Limpar o token do buffer
                }
            }
        var selectedOperation = Operation.values()[operationOption - 1];
        System.out.println("Digite os números que serão utilizados na equação. (Separados por vírgula - 1,2,3,4) ");
        var numbers = scanner.next();

        //Sanitização: Remover espaços em branco que o usuário digitar
        var sanitizedNumbers = numbers.replaceAll("\\s+","");

        BigDecimal[] numberArray = Arrays.stream(sanitizedNumbers.split(",")).map(BigDecimal::new).toArray(BigDecimal[]::new);
        // variável numberArray, cria um array de números, utiliza a função split para usar a vírgula como separador.
        var result = selectedOperation.exec(numberArray);
        var operationLogic = selectedOperation.formatEquation(numberArray);
        System.out.printf("Resultado: %s = %s \n",operationLogic, result);
    } catch (NumberFormatException e) {
        System.out.println("Erro de formato: Certifique-se de usar apenas números e vírgulas (Ex: 1,2.5,3).");
    } catch (ArithmeticException e) {
        System.out.println("Erro matemático: " + e.getMessage()); // Captura divisões por zero, etc.
    } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado no sistema.");
    }
}}
