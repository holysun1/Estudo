package Exercícios2;
import java.util.Arrays;

public class EvenAndOdd {
    public static void main(String[] args) {
//EXEMPLO DE ARRAY
        int [] array = {3,8,5,12,7,6};
        int n = array.length;
        int [] newarray = new int [n];
        int count = 0;

//LOOP PRINCIPAL
        for(int i=0; i< n ; i++){
            boolean odd = false;
//CONDIÇÃO PARA NÚMEROS PARES ( RESTO = 0)
            if(array[i] % 2 == 0){
                odd = true;
                System.out.println(Arrays.toString(newarray));
            }
            if(odd){
                newarray[count] = array[i];
                count++;
                System.out.println(Arrays.toString(newarray));
            }
        }
//CONDIÇÃO PARA OS ÍMPARES (RESTO != 0
         for(int j=0; j< n ; j++){
                if(array[j] % 2 != 0){
                newarray[count] = array[j];
                count++;
            }
         System.out.println(Arrays.toString(newarray));
        }
    }   
}
