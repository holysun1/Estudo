package Exercícios2;
import java.util.Arrays;

public class Element {
    public static void main(String[]args){
        //EXEMPLO DE ARRAY
        int [] array={4,1,2,4,2,3,4,5};
        //DECLARAÇÃO DE VARIÁVEL
        int n = array.length;
        int [] newarray = new int [n];
        int count=0;
        //LOOP PRINCIPAL
        for(int i = 0; i < n ; i++){
            // CONDIÇÃO PARA ÚNICO 
            boolean unc = true;
            for(int j = 0 ; j < n;j++){
                //CONDIÇÃO IF PARA TORNAR ÚNICO FALSO
                if(array[i] == array[j] && i != j ){
                    unc = false;
                    break;
                }
                //SE VALOR ÚNICO VERDADEIRO, SOMAR EM UM NOVO ARRAY
            }if(unc){
                newarray[count] = array[i];
                count++;
            }
        }
        //IMPRESSÃO DO NOVO ARRAY SOMENTE COM A QUANTIDADE DE NÚMEROS ÚNICOS
            System.out.println(Arrays.toString(Arrays.copyOf(newarray, count)));}}
    
            
        
        
    

