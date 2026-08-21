package teste;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        //EXEMPLO DE ARRAY
        String  s = "(){[]}";
        String  t = "([)]";
        //CRIAÇÃO DE PILHA (STACK)
        Stack <Character> stack = new Stack<>();
        // CRIAÇÃO DE LOOP PARA A PILHA
        //.toCharArray , transforma a String "s" em um array de caracteres
        // PERCORRE CADA CARACTERE DA STRING "S"
        for(char c : s.toCharArray()){
            //PRIMEIRA CONDIÇÃO IF
            //SE ABRIR A STRING COM "(" , EMPILHA O FECHAMENTO ")"
            if(c == '('){
                stack.push(')');
            }else if (c == '['){ // MESMA LÓGICA PORÉM COM ELSE IF
                stack.push(']');
            }else if (c == '{'){
                stack.push('}');
            }
            //ÚLTIMO ELSE IF
            // SE A PILHA ESTIVER VAZIA -> Ñ DEVERIA FECHAR SEM ABRIR
            // OU O TOPO DA PILHA NÃO CORRESPONDE AO CARACTERE ATUAL
            else if (stack.isEmpty() || stack.pop() !=c){
                System.out.println("false");
                return;
            }
        }
        //stack.clear = LIMPA A PILHA
        // VERIFICA SE ELA ESTA VAZIA, SE SIM, TODOS OS FECHAMENTOS ESTÃO CORRETOS;
        stack.clear();
        System.out.println("({[]})" + (stack.isEmpty() ? "true" : "false \n" ));

    }
    
}
