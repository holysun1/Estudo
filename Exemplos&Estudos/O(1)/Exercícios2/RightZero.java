package Exercícios2;

import java.util.Arrays;

public class RightZero {
    public static void main(String[] args){
        //EXEMPLO DE ARRAY
        int [] array = {0,3,0,1,0,7};

        //DEFINIÇÃO DE VARIÁVEIS
        int n = array.length;
        int count = 0;
        int [] newarray = new int[n];

        //DEFINIÇÃO DE LOOP
        for(int i = 0 ; i < n ;i++){
            //CONDIÇÃO PARA A FUNÇÃO - ZEROS A DIREITA
            if(array[i] > 0){
                newarray[count] = array[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(newarray));
    }
    
}
