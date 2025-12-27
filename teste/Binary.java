package teste;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        //CRIAÇÃO DE INTERFACE COM USUÁRIO
      Scanner sc = new Scanner(System.in);
      System.out.println("Digite um número decimal: ");
      int num = sc.nextInt();

    //CRIAÇÃO DA PILHA PARA ARMAZENAR OS VALORES "INTEGER"
    //new Stack<>() chama o construtor e cria a pilha vazia
    Stack <Integer> pilha = new Stack<>();
    int n = num;

    while (n > 0){
        int resto = n%2;
        pilha.push(resto);
        n = n/2;
    }

    StringBuilder binario = new StringBuilder();

    while (!pilha.isEmpty()){
        //APPEND ADICIONA O DÍGITO AO FINAL DA STRING
        binario.append(pilha.pop());
    }
    System.out.println(binario.toString());


    }
}
