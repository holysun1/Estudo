package Estudo1;
import java.util.Arrays;
import java.util.Scanner;

// Problema:
//Dado um array de inteiros, encontre:
//O maior valor
//O menor valor
//A média
//Exemplo:
//Entrada: [10, 20, 5, 8]

public interface Ex9 {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("\n ------- Vamos lá. ------- \n");
        System.out.println("\n ------- Quantos números deseja inserir na lista ? ------- \n");
        int tamanho = leitor.nextInt();
        int[] nums = new int [tamanho];
        for(int i = 0 ; i < tamanho ; i++){
            System.out.println("Digite o "+ (i + 1)+ "º" + " número da lista.");
            nums[i] = leitor.nextInt();
            if(i+1 != tamanho){
            System.out.println("\n ------- Lendo... ------- \n");}
            try {
            Thread.sleep(2000); // Tenta pausar por 3 segundos
        } catch (InterruptedException e) {
            // Se algo interromper a pausa, o erro cai aqui
            System.out.println("A execução foi interrompida inesperadamente.");
        }
            if(i+1 == tamanho){
                System.out.println("\n ------- Todos os números foram lidos. ------- \n ");
                System.out.println("A lista: " + Arrays.toString(nums) + " esta correta ? ");
                System.out.println("\n ------- 1. Sim  // 2. Não -------");
                int resp = leitor.nextInt();
                if(resp == 2){
                    i = -1;
                    System.out.println("\n Por favor refaça a lista. \n");
                }//CRIAR O MAIOR E O MENOR NÚMERO
                int maior = nums[0];
                int menor = nums[0];
                if(resp == 1 ){
                        for(int j = 0; j < nums.length ; j++){
                            if(nums[j] > maior){
                                maior = nums[j];
                            }
                            if(nums[j] < menor){
                                menor =  nums[j];
                            }
                        }
        
            int media = (maior+menor)/2;
            System.out.println("\n O maior número é: " + maior);
            System.out.println("\n O menor número é: " + menor);
            System.out.println("\n O media é: " + media);
        }
                        }
        }
    }
}
