package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rotate {
    public static void main(String[] args) {
        //EXEMPLO DE LISTA
        List <Integer> lista = Arrays.asList(1,2,3,4,5,7,5,2);

        //VARIÁVEIS
        int n = lista.size();
        int k = 2;
        List <Integer> novalista = new ArrayList<>();

        for(int i = 0; i < n ; i++){
            novalista.add(0);
        }

        for(int i = 0; i < n ; i++){
            int novaposicao = ( i + k) % n ;
            novalista.set(novaposicao, lista.get(i));
        } System.out.println(novalista);
    }
    
}
