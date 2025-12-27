package Exercícios2;
import java.util.Arrays;


public class SameElement {
    public static void main(String[] args) {
        //EXEMPLO DE ARRAYS
        int [] array_1 = {1,2,3,4};
        int [] array_2 = {3,4,5,6};
        int a1 = array_1.length;
        int a2 =  array_2.length;
        int count = 0 ;
        int [] newarray = new int[Math.min(a1,a2)];

    //LOOP PRINCIPAL
        for(int i = 0;  i < a1 ; i++){
            //LOOP SECUNDÁRIO
            for(int j = 0; j < a2  ; j++){
                //CONDIÇÃO IF
                if(array_1[i] == array_2[j]){
                    newarray[count] = array_1[i];
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(newarray, count)));
    }
    
}
