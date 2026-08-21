package Estudo1;

import java.util.Arrays;

//Crie uma função que receba uma lista de números inteiros e
//retorne a soma apenas dos números positivos, ignorando números repetidos.

public class Ex3 {
    public static void main(String[] args) {
        //CRIAÇÃO DE VARIÁVEIS
        int [] lista = {1,2,2,-1,3,0,3,4,-6};
        int n = lista.length;
        int soma=0;
        int [] novalista = new int [n];
        int count =0 ;
        //CRIAÇÃO DA NOVA LISTA
        
        for(int i =0 ; i < n ; i++){
            int atual = lista[i];
            if(atual <= 0 ){
                continue;
            }

            boolean rpt = false;

            for(int j= 0; j < n ; j++){
                if(novalista[j] == atual){
                    rpt = true;
                    break;
                }
            }
            if(!rpt){
                novalista[count] = atual;
                soma += atual;
                count++;
            }
        }
        System.out.println(Arrays.toString(novalista));
        System.out.println(soma);
    }
}
