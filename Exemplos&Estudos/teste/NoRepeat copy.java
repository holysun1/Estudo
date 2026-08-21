package teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoRepeat {
    public static void main(String[] args) {
        //EXEMPLO DE LISTA
        List <Integer> lista = Arrays.asList(4,5,1,2,1,5,4);
        // EXEMPLO COM MAP E HASHMAP
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num : lista){
            freq.put(num,freq.getOrDefault(num, 0)+1);
        }
        for(int num:lista){
            if(freq.get(num) == 1){
                System.out.println(num);
                break;
            }
        }
    }
}
