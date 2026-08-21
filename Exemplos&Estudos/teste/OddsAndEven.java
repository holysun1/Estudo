package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddsAndEven {
    public static void main(String[] args) {
        //EXEMPLO DE LISTA
        List <Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //CRIAÇÃO DE VARIÁVEIS E LISTAS
        int n = lista.size();
        List <Integer> odds = new ArrayList<>();
        List <Integer> even = new ArrayList<>();

        for(int i = 0 ;  i < n ; i++){
            int atual = lista.get(i);
            if(atual % 2 == 0){
                odds.add(lista.get(i));
            }else{
                even.add(lista.get(i));
            }
        }
        System.out.println("LISTA DOS PARES: " + odds + "\n" + "LISTA DOS IMPARES: " + even);
    }
    
}
