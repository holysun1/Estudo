package teste;

import java.util.ArrayList;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        // CRIAÇÃO DA LISTA
        List <Integer> lista = new ArrayList<>();
        //EXEMPLO DE LISTA
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(7);
        lista.add(8);
        lista.add(11);
        // CRIAÇÃO DAS VARIÁEIS
        int maior = lista.get(0);
        int menor = lista.get(0);
        int n = lista.size();

        //LOOP
        for(int i = 1 ; i < n ; i++){
            int atual = lista.get(i);

            if(atual > maior){
                maior = atual;
            }

            if(atual < menor){
                menor = atual;
            }

        }
        System.out.println("MAIOR NÚMERO: " + maior + "\n" + "MENOR NÚMERO: " +menor );
    }
}
