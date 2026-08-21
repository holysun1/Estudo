package teste;
import java.util.Stack;

public class RemoveChar {
    public static void main(String[] args) {
        //EXEMPLO DE WORD
        String word = "banana";
        char remove = 'a';
        
        //CRIAÇÃO DA PILHA STACK
        Stack <Character> stack = new Stack<>();
        
        //Percorrer a palavra e remover o caractere
        for( char c : word.toCharArray()){
            if(c != remove){
                stack.push(c);
                System.out.println("------- STACK PUSH -------");
                System.out.println("\n" + stack);
        }
    }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.insert(0, stack.pop());
        }
        System.out.println(result);
    }
}


