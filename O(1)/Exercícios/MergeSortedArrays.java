import java.util.Arrays;

public class MergeSortedArrays {
    public static void main (String [] args){

// DECLARAÇÃO DE VARIÁVEIS E ARRAYS
        int [] lista = {1,3,5};
        int [] lista2 = {2,4,6,7};
        int n1 = lista.length;
        int n2 = lista2.length;
        int n = n1 + n2;
        int [] novalista = new int [n];
        int i = 0;
        int j = 0;
        int t = 0;
        // LOOP PARA PERCORRER OS DOIS ARRAYS E MESCLÁ-LOS
        while ( t < n){
            // CONDIÇÃO PARA ADICIONAR OS VALORES NA NOVA LISTA
            if (i < n1 && (j >= n2 || lista[i] < lista2[j])){
                // ADICIONA OS VALORES NA NOVA LISTA
                novalista[t] = lista[i];
                System.out.println(Arrays.toString(novalista)+"\n" + "i = " + i + ", j = " + j);
                i++;
                t++;
            }else{
                // ADICIONA OS VALORES NA NOVA LISTA
                novalista[t] = lista2[j];
                System.out.println(Arrays.toString(novalista) + "\n" + "j = " + j + ", i = " + i);
                j++;
                t++;
            }
        }
    }
}


                
            
        
    

        
       


