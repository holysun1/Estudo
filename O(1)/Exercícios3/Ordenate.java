package Exercícios3;

public class Ordenate {
    public static void main(String[]args){
        //EXEMPLO DE ARRAY
        int [] array = {1,2,3,4,9};
        //DECLARAÇÃO DE VARIÁVEIS
        int n = array.length;
        boolean cresc = true;
        //LOOP PRINCIPAL
        for(int i=0; i < n-1  ;i++){
            //CONDIÇÃO DO EXERCÍCIO
            if(array[i] > array[i+1] ){
                cresc = false;
            }
    }
    System.out.println("O ARRAY É CRESCENTE ? \n" + cresc);
}
}
