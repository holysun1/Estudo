package Estudo1;
//Enunciado
//Crie uma função que receba uma lista de palavras e um número inteiro n, 
//retornando apenas as palavras que tenham tamanho maior ou igual a n, 
//todas em letras minúsculas.

import java.util.Arrays;

//--------------------------Regras-------------------------------
//- A comparação deve ignorar maiúsculas/minúsculas
//- A lista pode conter palavras repetidas (não precisa remover repetidas)
public class Ex5 {
    public static void main(String [] args){
        String[] palavras = {"CI&T", "Next", "GEN", "AI", "programa"};
        int n = palavras.length;
        int k = 4;
        int count = 0;
        String[] lista = new String[n];

        for(int i = 0 ; i < n ; i++){
            String atual = palavras[i];
            char[] a = atual.toCharArray();
            int m = a.length;
            if(m >= k){
                lista[count] = atual.toLowerCase();
                count++;
            }else{
                continue;
            }
        }
        System.out.println(count+ " Palavras");
        System.out.println(Arrays.toString(Arrays.copyOf(lista, count)));
    }
    
}
