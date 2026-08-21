package teste;
import java.util.Stack;

public class ReverterString {
    public static void main(String[] args) {
        //EXEMPLO DE ARRAY
        String s = "banana";
        //CRIAÇÃO DE PILHA
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            stack.push(c);
        }
        String reversed = "";
        while (!stack.isEmpty()){
            reversed += stack.pop();       
        }

        System.out.println("\n" + reversed);
        }
    }
    

