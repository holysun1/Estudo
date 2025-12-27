package teste;

import java.util.Scanner;
import java.util.Stack;

public class Exerc2 {
    public static void main(String[] args) {
        
        //EXEMPLO DE INTERFACE SIMPLES 
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite: ");
        String word = sc.nextLine();

        //CRIAÇÃO DE PILHA
        Stack <Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        //CRIAÇÃO DE LOOP
        for( char c : word.toCharArray()){
            //PRIMEIRA CONDIÇÃO DE FECHAMENTO
            if( c == '(' ){
                stack.push('(');
            }else if(c == ')'){ 
                if(stack.isEmpty()){
                    continue;
                }
                stack.pop();
            }if(c != '(' && c != ')'){
                    result.append(c);
                
            }
        }System.out.println("Resultado: " + "[" +result + "]");
        sc.close();
    }
    
}
