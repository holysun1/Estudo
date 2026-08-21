package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoRepeat {
    public static void main(String[] args) {
        //EXEMPLO DE LISTA
        List <Integer> lista = Arrays.asList(4,5,1,2,1,5,4);
        //DECLARAÇÃO DE VARIÁVEIS
        int n = lista.size();
        boolean rpt = false;

        //LOOP
        for(int i = 0 ; i < n ; i++){
            int atual = lista.get(i);
            int count = 0;
            //SEGUNDO LOOP PARA SOMAR O CONTADOR
            for(int j = 0 ; j < n ; j++){
                if(lista.get(j) == atual){
                    count++;
                }
            }// SE O CONTADOR FOR SOMENTE = 1, É PORQUE O NÚMERO NÃO SE REPETE
            if(count == 1){
                System.out.println("O primeiro número que não se repete é: " +atual);
                break;
            }
        }
    }
}
