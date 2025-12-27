package Exercícios2;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[]args){
        //EXEMPLO DE ARRAY COM VALOR ALVO
        int [] array = {1,3,2,2,4};
        int k = 4;
        //DEFINIÇÃO DE VARIÁVEL
        int n = array.length;
        int [] newarray = new int[n];
        int count=0;
        //LOOP PRINCIPAL - FUNÇÃO PEGAR O PRIMEIRO VALOR E SOMAR COM VALOR[J]
        // PARA ATINGIR O VALOR ALVO
        for(int i =0 ; i < n ; i++){
            //LOOP SECUNDÁRIO
            for(int j=0; j<i;j++){
                //CONDIÇÃO DO EXERCÍCIO
                if(array[i] + array[j] == k){
                    count++;
                    System.out.println("\n primeiro valor: " + array[i] + "\n segundo valor: "+ array[j] +"\n");
                    System.out.println(" i: " + i + "\n j: "+ j + "\n quantia: " + count);
                }
            }
        }
        System.out.println( "\n Quantia de pares: " + count);
    }
    
}
