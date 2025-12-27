package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InverterList {
    public static void main(String[] args) {
        //CRIAÇÃO DE LISTA
        List <Integer> lista = Arrays.asList(1,2,3,4,5);

        //CRIAÇÃO DE VARIÁVEL
        int n = lista.size();
        //CRIAÇÃO DE LISTA INVERTIDA
        List <Integer> invertida = new ArrayList<>();

        //CRIAÇÃO DE LOOP
        //COMEÇA COM O MAIOR NÚMERO DE ÍNDICE, E ADICIONAR A NOVA LISTA (INVERTIDA) CADA ÍNDICA REDUZIDO, (5 -> 0 ; 4 -> 1.....)
        for(int i =  n -1 ; i >=0; i--){
            invertida.add(lista.get(i));
        }
        System.out.println(invertida);
    }
}
