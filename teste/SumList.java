package teste;

import java.util.ArrayList;
import java.util.List;

public class SumList {
    public static void main(String[] args) {
        
        // LISTA DE EXEMPLO
        List <Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        int n = lista.size();

        // VARÍAVEL PARA ARMAZENAMENTO
        int soma = 0;

        //LOOP PARA PERCORRER A LISTA
        for (int i = 0; i < n; i ++){
            soma += lista.get(i);
        }
        //RESULTADO
        System.out.println("SOMA: " + soma);

    }
}
