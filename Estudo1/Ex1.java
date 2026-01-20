package Estudo1;

import java.util.Arrays;

public class Ex1{
    public static void main(String[]args){
        //CRIAÇÃO DE VARIÁVEL LISTA
        int [] list = {1,2,3,4,5,6,-2};
        int n = list.length;
        int par = 0;
        int impar = 0;
        int [] novalista = new int [2];

        for(int i=0 ; i < n ; i++){
            if(list[i]%2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println(par);
        System.out.println(impar);
        novalista[0] = par;
        novalista[1] = impar;
        System.out.println(Arrays.toString(novalista));
    }
}