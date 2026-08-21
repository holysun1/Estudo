package Exercícios2;
import java.util.Arrays;

public class RotateRight {
    public static void main(String[]args){
        //EXEMPLO DE ARRAY
        int [] array = {1,2,3,4,5};
        //DEFINIÇÃO DE VARIÁVEIS
        int k = 2;
        int n = array.length;
        k = k%n;
        int [] newarray = new int [n];
        int count = n-k;
        //LOOP PRINCIPAL
        for(int i=0; i < n ; i++){
            if(count < n){
            newarray[i] = array[count];
            count++;
            }else{
                count = 0;
                newarray[i] = array[count];
                count++;
            }
            
            System.out.println(Arrays.toString(newarray));
            System.out.println(i);
        }   

    }   
    
}
