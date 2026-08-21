package Exercícios2;

public class Ordenate {
    public static void main(String[] args){
        //EXEMPLO DE ARRAYS
        int[] array_1 = {1,2,3,4};
        //DEFINIÇÃO DE VARIÁVEL
        int a1 = array_1.length;
        boolean cresc = true;
        //LOOP PRINCIPAL
        for(int i=0; i < a1-1 ; i++){
            //CONDIÇÃO
            if(array_1[i] > array_1[i+1]){
                cresc = false;
                break;
            }
        }           
        System.out.println(cresc);
    }
}
