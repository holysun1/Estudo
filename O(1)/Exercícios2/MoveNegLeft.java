package Exercícios2;
import java.util.Arrays;
public class MoveNegLeft {
    public static void main(String[] args){
        // ARRAY EXEMPLO
        int [] array = {3,-1,2,-7,4};
        // DEFINIÇÃO DE VARIÁVEIS
        int n = array.length;
        int [] newarray = new int [n];
        int count = 0;
        //DEFINIÇÃO DE LOOP PARA PERCORRER O ARRAY
    for(int i=0 ; i < n; i++){
        //CONDIÇÃO PARA SALVAR OS NÚMEROS NEGATIVOS
        if(array[i] < 0){
            newarray[count] = array[i];
            count++;
        }
    }
    //LOOP PARA SALVAR OS NÚMEROS POSITIVOS
    for(int j = 0 ; j < n ; j++){
        //CONDIÇÃO PARA SALVAR OS NÚMEROS POSITIVOS
        if(array[j] >= 0){
            newarray[count] = array[j];
            count++;
        }
    }
        System.out.println(Arrays.toString(newarray));
    }
}


