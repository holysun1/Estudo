package Exercícios3;
import java.util.Arrays;

public class DuplicateRemove {
    public static void main(String[] args) {
        //EXEMPLO DE ARRAY
        int[] array = {4,4,2,1,2};

        //DECLARAÇÃO DE VARIÁVEIS
        int n = array.length;
        int [] newarray = new int [n];
        int count = 0;

        //LOOP
        for(int i=0 ; i < n ; i++){
            boolean rpt = false;
            for(int j = i+1; j<n;j++){
                if(array[i] == array[j]){
                    rpt = true;
                    break;
                }if(!rpt){
                    newarray[count] = array[i];
                    count++;
                }
                break;
            }
            System.out.println(Arrays.toString(Arrays.copyOf(newarray,count)));
        }
    }
    
}
