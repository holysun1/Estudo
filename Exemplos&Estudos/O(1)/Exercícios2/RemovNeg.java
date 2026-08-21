package Exercícios2;
import java.util.Arrays;

public class RemovNeg {
    public static void main(String[]args){
        // EXEMPLO DE ARRAY
        int [] array = {3,-1,2,-7,4};

    //DEFINIÇÃO DE VARIÁVEIS
        int n = array.length;
        int [] newarray =  new int [n];
        int count = 0;
        //DEFINIÇÃO DE LOOP PARA SALVAR OS NÚMEROS POSITIVOS
        for(int i = 0 ; i < n ; i++){
            //CONDIFAÇÃO PARA SALVAR OS NÚMEROS POSITIVOS
            if(array[i] > 0){
                newarray[count] = array[i];
                count++;
            }
        }
        //DEFINIÇÃO DE LOOP PARA SALVAR OS NÚMEROS NEGATIVOS
        for(int j = 0 ; j < n ; j++){
            //CONDIFAÇÃO PARA SALVAR OS NÚMEROS POSITIVOS
            if(array[j] < 0){
                newarray[count] = array[j];
                count++;
            }
        }
        //IMPRESSÃO DE RESULTADO
        System.out.println(Arrays.toString(newarray));
    }
    
}
