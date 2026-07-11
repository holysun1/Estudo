package br.com.dio;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            var scanner = new Scanner(System.in);
            scanner.useLocale(java.util.Locale.US);
            System.out.println("1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão");
            System.out.println("Opção: ");

            var opcao = scanner.nextInt();
            double primeiroValor = 0;
            double segundoValor = 0;
            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro valor: ");
                    primeiroValor = scanner.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    segundoValor = scanner.nextDouble();
                    double soma = primeiroValor + segundoValor;
                    System.out.print("\n"+ primeiroValor + " + " +segundoValor + " = " + soma+"\n");
                    break;
                case 2:
                    System.out.print("Digite o primeiro valor: ");
                    primeiroValor = scanner.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    segundoValor = scanner.nextDouble();
                    double subtracao = primeiroValor - segundoValor;
                    System.out.print("\n"+ primeiroValor + " - " +segundoValor + " = " + subtracao+"\n");
                    break;
                case 3:
                    System.out.print("Digite o primeiro valor: ");
                    primeiroValor = scanner.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    segundoValor = scanner.nextDouble();
                    double multiplicacao = primeiroValor * segundoValor;
                    System.out.print("\n"+ primeiroValor + " * " +segundoValor + " = " + multiplicacao+"\n");
                    break;
                case 4:
                    System.out.print("Digite o primeiro valor: ");
                    primeiroValor = scanner.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    segundoValor = scanner.nextDouble();
                    double divisao = primeiroValor / segundoValor;
                    System.out.print("\n"+ primeiroValor + " / " +segundoValor + " = " + divisao+"\n");
                    break;
            }
        System.out.println("====== Obrigado ======");
    }
}