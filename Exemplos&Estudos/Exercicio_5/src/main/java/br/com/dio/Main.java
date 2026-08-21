package br.com.dio;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.print("Escolha a forma geométrica: \n");
            System.out.print("1 - Quadrado: \n");
            System.out.print("2 - Retangulo: \n");
            System.out.print("3 - Circulo: \n");
            System.out.print("4 - Sair: \n");
            System.out.print("================================================ \n");
            System.out.print("Digite o número: ");
            int option = scanner.nextInt();
                if (option == 1) {
                    createSquare();
                    try {
                        // 2000 milissegundos = 1.5 segundos
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        // Trata o erro caso a thread seja interrompida
                        System.err.println("O processo de espera foi interrompido.");
                    }
                }
                else if (option == 2) {
                    createRectangle();
                    try {
                        // 2000 milissegundos = 1.5 segundos
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // Trata o erro caso a thread seja interrompida
                        System.err.println("O processo de espera foi interrompido.");
                    }
                }
                else if (option == 3) {
                    createCircle();
                    try {
                        // 2000 milissegundos = 1.5 segundos
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        // Trata o erro caso a thread seja interrompida
                        System.err.println("O processo de espera foi interrompido.");
                    }
                }
                else if (option == 4) {
                    System.out.print("================================================ \n");
                    try{
                        Thread.sleep(2000);
                    }catch (InterruptedException e){
                        System.err.println("O processo de espera foi interrompido.");
                    }
                    System.out.println("Obrigado...");
                    System.out.print("================================================ \n");
                    break;
                }
        }
    }
    public static void createSquare() {
        System.out.print("Insira o valor da aresta do quadrado: \n: ");
        double side = scanner.nextDouble();
        Square square = new Square(side);
        System.out.println("-------");
        System.out.println("Calculando área....");
        try {
            // 2000 milissegundos = 1.50 segundos
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Trata o erro caso a thread seja interrompida
            System.err.println("O processo de espera foi interrompido.");
        }
        System.out.println("Area do Quadrado: " + square.getArea());
        System.out.println("================================================");
    }
    public static void createRectangle() {
        System.out.print("Insira o valor da altura do retangulo: \n: ");
        double height = scanner.nextDouble();
        System.out.print("Insira o valor da base do retangulo: \n: ");
        double base = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(base, height);
        System.out.println("-------");
        System.out.println("Calculando área....");
        try {
            // 2000 milissegundos = 1.5 segundos
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Trata o erro caso a thread seja interrompida
            System.err.println("O processo de espera foi interrompido.");
        }
        System.out.println(rectangle.getArea());
        System.out.println("================================================");
    }
    public static void createCircle() {
        System.out.print("Insira o valor do raio do circulo: \n: ");
        double radius = scanner.nextDouble();
        Circle  circle = new Circle(radius);
        System.out.println("-------");
        System.out.println("Calculando área....");
        try {
            // 2000 milissegundos = 1.5 segundos
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Trata o erro caso a thread seja interrompida
            System.err.println("O processo de espera foi interrompido.");
        }
        System.out.println(circle.getArea());
        System.out.println("================================================");
    }
}