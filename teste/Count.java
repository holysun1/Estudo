package teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count {
    public static void main(String[] args) {
        //CRIAÇÃO DE LISTA
        List <Integer> lista = new ArrayList<>();
        //LISTA EXEMPLO
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(1);

        //CRIAÇÃO DE VARIÁVEIS
        int n = lista.size();
        //CRIAÇÃO DE LISTA PARA REPETIDOS
        List <Integer> rptds = new ArrayList<>();
        //CRIAÇÃO DO LOOP
        for(int i = 0 ;  i < n ; i ++){        
            int count = 0;
            int atual = lista.get(i);
            for(int j = 0 ; j < n ; j++){
                if(lista.get(j) == atual){
                    count++;
                }
            }
            if(count > 1 && !rptds.contains(atual)){
                rptds.add(atual);
            }
        }
        System.out.println(rptds);
    }
}
