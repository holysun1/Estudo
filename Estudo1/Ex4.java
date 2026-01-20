package Estudo1;

//Crie uma função que verifique se uma lista de números 
//inteiros está em ordem estritamente crescente.

//------------------------Regras-----------------------

//-Lista vazia ou com um único elemento deve retornar True
//-Números iguais quebram a regra

public class Ex4 {
    public static void main(String[] args){ 
        //CRIAÇÃO DE VARIÁVEL 
        int [] lista = {1,2,3,4,5,6};
        int n = lista.length;
        boolean cresct = true;

        for(int i = 0; i < n-1 ; i++){
            if(lista[i] >= lista[i+1]){
                    cresct = false;
                    break;
            }
        }
        System.out.println(cresct);
    }
}
