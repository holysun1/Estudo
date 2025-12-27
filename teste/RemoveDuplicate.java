package teste;
import java.util.Stack;

public class RemoveDuplicate {
    public static void main(String[] args) {
        //EXEMPLO DE WORD
        String word = "abbaca";
        // CRIAÇÃO DE PILHA STACK
        Stack<Character> stack = new Stack <>();
        for(char c : word.toCharArray()){
            //PRIMEIRA CONDIÇÃO
            // ANALISA SE A PILHA ESTA VAZIA, SE NÃO ESTIVER VAZIA
            // ANALISA SE O ELEMENTO DO TOPO DA PILHA .peek() , É IGUAL AO ELEMENTO ATUAL ANALISADO
            // OU SEJA, --- SE O ELEMENTO DO TOPO FOR "A" E O ELEMENTO QUE
            // ESTAMOS ANALISANDO TAMBÉM É "A", SE ELE FOR INSERIDO .push
            // IREMOS TER ELEMENTOS DUPLICADOS, OU SEJA "AA".
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
                System.out.println("------- STACK POP -------");
                System.out.println("\n" + stack);
            }else{
                //SE AS CONDIÇÕES DO IF NÃO FOREM VERDADEIRAS, ACRESCENTA O ELEMENTO
                //DO TOPO DA PILHA PARA A PILHA, OU SEJA
                //SE MINHA PILHA É "ABC" E O TOPO É "D"
                //MINHA NOVA PILHA FICARÁ "ABCD"
                stack.push(c);
                System.out.println("------- STACK PUSH -------");
                System.out.println("\n" + stack);
            }
            //STRINGBUILDER É UM OBJETO MUTÁVEL PARA CONSTRUIR STRINGS
        }StringBuilder result = new StringBuilder();
        //CONDIÇÃO WHILE = ENQUANTO A PILHA NÃO ESTIVER VAZIA
        //REMOVER O ÚLTIMO ELEMENTO DA PILHA E INSERI-LO NO COMEÇO DA PILHA
        //AO DESEMPILHAR, A ORDEM FICA INVERTIDA
        while(!stack.isEmpty()){
            result.insert(0,stack.pop());
        }
        System.out.println("------- RESULTADO -------");
        System.out.println("\n Resultado: " + result);

    }
}