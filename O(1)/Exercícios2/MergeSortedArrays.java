package Exercícios2;
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args){
        // Exemplo de arrays ordenados
     int[] nums1 = {1,3,5};
        int[] nums2 = {2,4,6};

        // Tamanhos dos arrays
        int n1 = nums1.length;
        int n2 = nums2.length;
        // Array para armazenar o resultado
        int[] result = new int[n1+n2];
        // Índices para percorrer os arrays
        int i = 0;  
        int j = 0;  
        int k = 0;  
        // Mescla os arrays
        while(i < n1 && j < n2){
            // Compara e adiciona o menor elemento ao array resultante
            if(nums1[i] < nums2[j]){
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        // copia o restante da lista que sobrou
        while(i < n1){
            result[k++] = nums1[i++];
        }

        while(j < n2){
            result[k++] = nums2[j++];
        }

        System.out.println(Arrays.toString(result));
    }   
}
