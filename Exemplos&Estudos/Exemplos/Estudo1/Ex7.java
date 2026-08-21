package Estudo1;

//Enunciado

//Crie uma função que receba
//uma lista de números inteiros e retorne a diferença entre o maior e o menor valor.

//----------------------Regras

//- Lista com menos de 2 elementos retorna 0
//- Números negativos devem ser considerados

public class Ex7 {
    public static void main(String[] args) {
        int[] lista = {4,2,1,8,2,15,1,2,27,4,-5,9,-9};
        int n = lista.length;
        int maior = lista[0];
        int menor = lista[0];

        if(n < 2){
            System.out.println("Acrescente valores a lista. Quantidade mínima 2.");
        }else{
        for(int i= 0 ; i < n ; i++){
             if(lista[i] > maior){
                maior = lista[i];
             }if(lista[i] < menor){
                menor = lista[i];
             }
            }
             System.out.println(maior);
             System.out.println(menor);
             System.out.println("A Diferença entre os valores máximos e mínimos é: " + (maior - menor) );
             
        }
    }
} 
