package Exercícios3;
// EXERCÍCIO PARA CONTAR OS NÚMEROS REPETÍDOS
public class CountRPT {
    public static void main(String[]args){
        // EXEMPLO DE ARRAY
        int [] array = {4,1,2,4,2,3};

        //DECLARAÇÃO DE VARIÁVEIS
        int n = array.length;
        boolean [] counted = new boolean[n];
        
        
        //LOOP PRINCIPAL
        for(int i =0; i < n ; i ++){
            if(counted[i] == true){
            continue;
        }
        int count = 1;
            //LOOP SECUNDÁRIO PARA COMPARAR VALORES
            for(int j = i+1; j < n ; j++){
                //CONDIÇÃO DE IGUALDADE DO EXERCÍCIO
                if(array[i] == array[j]){
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println("O número " + array[i] + " se repete " + count + " vezes.");
        }

    }
}
