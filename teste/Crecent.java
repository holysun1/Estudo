package teste;

import java.util.Arrays;
import java.util.List;

public class Crecent {
    public static void main(String[] args) {
        //EXEMPLO DE LISTA
        List <Integer> lista_1 = Arrays.asList(1,2,3,4,5);
        List <Integer> lista_2 = Arrays.asList(5,4,3,2,1);
        List <Integer> lista_3 = Arrays.asList(5,1,2,3,4);
        List <Integer> lista_4 = Arrays.asList(1,2,1,4);

        boolean crescent = true;
        int n = lista_4.size();
        for(int i = 0; i < n-1 ; i++){
        int atual = lista_4.get(i);
            if(atual > lista_4.get(i+1)){
                crescent = false;
                break;
             }
        }if(crescent){
            System.out.println("A lista " + lista_4 + " é crescente?" + "\n" + crescent);
        }else{
            System.out.println("A lista " + lista_4 + " é crescente?"+"\n" + crescent);
        }
    }
}
