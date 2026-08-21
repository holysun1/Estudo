public class MajorityElement {
    public static void main(String [] args) {
    //-------------------------- EXERCÍCIO 1 -----------------------------
  System.out.println("------- EXERCÍCIO 1 -------- \n");

    // MAJORITY ELEMENT
            //DECLARAÇÃO DE VARIÁVEIS E ARRAYS
            int []lista1 = {3,1,3,3,2};
            int n = lista1.length;
            int maxcont = 0;
            int majority = lista1[0];
            // LOOP PARA PERCORRER O ARRAY
            for(int i=0; i < n ; i++){
                // LOOP PARA CONTAR REPETIÇÕES
                        int cont = 0;
                        // SEGUNDO LOOP PARA COMPARAR VALORES
                for(int j=0; j < n;j++){
                    // CONDIÇÃO PARA CONTAR REPETIÇÕES
                    if( lista1[i] == (lista1[j])){
                        cont++;
                    }
                }
                // CONDIÇÃO PARA VERIFICAR SE REPETE MAIS DA METADE DAS VEZES
                        if(cont > maxcont){
                            maxcont = cont;
                            majority = lista1[i];
                        System.out.println(majority + " repete " + maxcont + " vezes");
                        break;
                        }
                        else{
                        System.out.println("Não repete mais da metade das vezes");
                        break;
                        }
                }
    }
}

