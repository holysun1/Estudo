package teste;

import java.util.Arrays;
import java.util.List;

public class SecondBiggest {
    public static void main(String[] args) {
        //LISTA DE EXEMPLO
        List <Integer> lista = Arrays.asList(5,1,9,7,2,4,10,15);
        //CRIAÇÃO DE VARIÁVEL
        int n = lista.size();
        int maior = lista.get(0);
        int segmaior = 0;


        //CRIAÇÃO DE LOOP
        for(int i = 1 ; i < n ; i ++){
            int atual = lista.get(i);
            if(maior < atual){
                segmaior = maior;
                maior = atual;
            }
        }
        
        System.out.println("SEGUNDO MAIOR NÚMERO: " + segmaior +"\n" + "MAIOR NÚMERO: " + maior);

    }
}
