package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remov {
    public static void main(String[] args) {
        
        //CRIAÇÃO DE LISTA / LISTA EXEMPLO
        List<Integer> lista = Arrays.asList(1,2,2,3,3,1,4);
        List<Integer> resultado = new ArrayList<>();

        //CRIAÇÃO DE VARIÁVEIS
        int n = lista.size();

        //LOOP
        for(int i = 0; i < n ; i++){
            int atual = lista.get(i);
            //CONDIÇÃO
            if(!resultado.contains(atual)){
                resultado.add(atual);
            }
            }
        
        System.out.println(resultado);
    }
    
}
