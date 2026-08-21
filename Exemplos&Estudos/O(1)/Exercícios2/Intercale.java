package Exercícios2;
import java.util.Arrays;
public class Intercale {
    public static void main(String[] args){
        // EXEMPLO DE ARRAYS
        int [] array1 = {1,3,5,7};
        int [] array2 = {2,4,6,8};
        int a1 = array1.length;
        int a2 = array2.length;
        int n =  a1+a2;
        int [] newarray = new int[n];
        int count = 0;
        //LOOP PRINCIPAL
        for(int i = 0 ; i< n && count < n ; i++){
            newarray[count] = array1[i];
            count++;
            newarray[count] = array2[i];
            count++;
            System.out.println(Arrays.toString(newarray));
        }
    }
}
