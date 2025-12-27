package Exercícios2;
import java.util.Arrays;


public class RemoveDuplicate {
    public static void main(String[] args){
        
        int[] array = {2,3,2,5,3,7,5};
        int n = array.length;

        int maxNum = Integer.MIN_VALUE; // sentinela (marca removidos)

        // marca repetidos
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(array[i] == array[j]){
                    array[j] = maxNum;  // marca o duplicado
                }
            }
        }

        // contar valores válidos
        int count = 0;
        for(int num : array){
            if(num != maxNum){
                count++;
            }
        }

        // criar novo array com valores válidos
        int[] newarray = new int[count];
        int idx = 0;

        for(int num : array){
            if(num != maxNum){
                newarray[idx++] = num;
            }
        }

        System.out.println(Arrays.toString(newarray));
    }
}
