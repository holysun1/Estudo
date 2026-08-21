package Estudo1;
import java.util.Scanner;

//Crie um programa que receba um número inteiro e diga se ele é:

//Positivo ou negativo
//Par ou ímpar

public interface Ex8 {
    public static void main (String[] args){
        //Criar o objeto scanner
        Scanner leitor = new Scanner(System.in);
        int entrada = 0;
        System.out.println("ESCOLHA UM NÚMERO. \n"+ "1. Jogar \n" +"2. Sair \n");
        entrada = leitor.nextInt();
        while(entrada == 1){
        System.out.println("Digite um número: \n" );
        //Leitor do terminal - interação com usuário
        int num = leitor.nextInt();
        System.out.println("------------ CALCULANDO ---------- \n");
        if(num > 0 ){
            System.out.println("Número " + "'" + num + "'" + " é positivo. \n");
        }else{
            System.out.println("Núemro "+ "'" + num + "'" + " é negativo. \n");
        }
        if(num % 2 == 0){
            System.out.println("Número "+ "'" + num + "'" + " é par. \n");
            System.out.println("--------------------------------\n");
        }else{
            System.out.println("Número "+ "'" + num + "'" + " é impar. \n");
            System.out.println("--------------------------------\n");
        }
        System.out.println("------------ Jogar de novo ---------- ");
        System.out.println("------------ 1. Sim  //  2. Não ---------- \n");
        entrada = leitor.nextInt();
        if(entrada == 2){
            System.out.println(" \n ---------- Até Mais ---------- \n");
            leitor.close();
            break;
        }
        }
    }
}
