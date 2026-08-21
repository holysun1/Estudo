package teste;

import java.util.Arrays;
import java.util.Stack;

public class RerverWords {
    public static void main(String[] args) {
        //EXEMPLO DE WORD
        String word = "ab,cd,ef";
        //CRIAÇÃO DE PILHA
        Stack <Character> stack = new Stack<>();
        String [] partes = word.split(",");
        int n = partes.length;
        StringBuilder resultado = new StringBuilder();
        System.out.println(Arrays.toString(partes));
        for( int i = n -1 ; i >= 0 ; i-- ){
            resultado.append(partes[i]);
            if(i != 0){
                resultado.append(",");
            }
        }
        
        System.out.println("-------------------------");
        System.out.println(resultado);
        }
    }
