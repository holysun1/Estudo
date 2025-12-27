package teste;

import java.util.Scanner;
import java.util.Stack;

public class Exerc1 {
    public static void main(String[] args) {
        // INTERFACE DE INTERAÇÃO COM O USUÁRIO
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a palavra: ");
        String word = sc.next();

        // CRIAÇÃO DE PILHA VAZIA STRING
        Stack <Character> stack = new Stack<>();
        for( char c : word.toCharArray()){
            stack.push(c);
        }
        System.out.println("\n" + "----------------"  + stack);
        String reverse = "";
        while(!stack.isEmpty()){
            reverse += stack.pop();
        }
        System.out.println("\n" + "----------------" + word);
        System.out.println("\n" + "----------------" + reverse);
        boolean palin = false;
        // NA COMPARAÇÃO DE STRINGS UTILIZA-SE A FUNÇÃO .EQUALS
        if(reverse.equals(word)){
            palin = true;
            System.out.println("A palavra é um palíndromo.");
        }else{
            System.out.println("A palavra não é um palíndromo.");
        }


    }
    
}
