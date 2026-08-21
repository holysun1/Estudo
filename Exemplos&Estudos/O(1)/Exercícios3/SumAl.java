package Exercícios3;
import java.util.Arrays;

public class SumAl {
    public static void main(String[] args) {
        //ARRAY EXEMPLO
        int [] array = {4,1,2,4,2,3};

        //DEFINIÇÃO DE VARIÁVEIS
        int n = array.length;
        int num = 0;
        int [] sum = new int [n];
        int somapar = 0;
        int somaimpar = 0;
        
        //LOOP
        for(int i=0; i<n; i++){
            if( i % 2 == 0 || i ==0){
                num = array[i];
                somapar = num + somapar;
                System.out.println("O número do loop: " + i + "\n");
                System.out.println("O valor do número: " + num + "\n");
                System.out.println("O valor do número do array: " + array[i] + "\n");
                System.out.println("A soma dos números pares é: " + somapar + "\n");
                System.out.println("---------------------------------------");
            }else{
                num = array[i];
                somaimpar = num + somaimpar;
                System.out.println("O número do loop: " + i + "\n");
                System.out.println("O valor do número: " + num + "\n");
                System.out.println("O valor do número do array: " + array[i] + "\n");
                System.out.println("A soma dos números impares é: " + somaimpar + "\n");
                System.out.println("---------------------------------------");}
        }            
    }
    
}
