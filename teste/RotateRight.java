package teste;
import java.util.Arrays;

public class RotateRight {
    public static void main(String[] args) {
        //EXEMPLO DE ARRAY
        int [] array =  {4,5,1,2,3};
        int k = 2;

        //DECLARAÇÃO DE VARIÁVEL
        int n = array.length;
        int [] newarray = new int [n];
        int count = n-k;
        //LOOP
        for(int i = 0 ; i < n ; i++){
            if(count < n){
            newarray[i] = array[count];
            count++;
            }else{
                count = 0;
                newarray[i] = array[count];
                count++;
            }
        }System.out.println(Arrays.toString(newarray));
    }
}
