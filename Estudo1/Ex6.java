package Estudo1;

import java.util.Arrays;

//Enunciado

//Crie uma função que receba uma String e 
//retorne quantos caracteres alfabéticos ela possui.

//--------------------------------------Regras
//-Ignore números, espaços e símbolos
//-Letras maiúsculas e minúsculas contam igualmente
//-String vazia retorna 0

public class Ex6 {
    public static void main(String[] args) {
        String palavra = "CI&T Next Gen 2025!";
        palavra = palavra.trim();
        int n = palavra.length();
        char[] c = palavra.toCharArray();
        int count =  0;

        for(int i = 0 ; i < n ; i++){
            if(Character.isLetter(c[i])){
                count++;
            }
        }System.out.println(count);
    }
}
