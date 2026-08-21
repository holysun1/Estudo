package Exercícios3;

public class BiggestNumber {
    public static void main(String[] args) {
        //ARRAY DE EXEMPLO
        int[] array = {8,2,10,4,7};
        //DECLARAÇÃO DE VARIÁVEL
        int n = array.length;
        boolean big = true;
        int biggestnum = array[0];
        int segnum = 0;

        //LOOP
        for(int i =0; i < n ;i++){
            if(array[i] > biggestnum){
                segnum = biggestnum;
                biggestnum = array[i];
            }
            else if(array[i] > segnum && array[i] != biggestnum){
                segnum = array[i];
            }
    }  
            System.out.println("Maior número = " + biggestnum);
        System.out.println("Segundo maior número = " + segnum);
    
    }
}
