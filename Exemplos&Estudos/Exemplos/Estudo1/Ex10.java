package Estudo1;
import java.util.Scanner;
//Problema:
//Crie um método que receba uma string e verifique se ela é um palíndromo
//(ignorar espaços e letras maiúsculas/minúsculas).

//Exemplo:
//Entrada: "A base do teto desaba"
//Saída: true

public class Ex10 {
    public static void main(String[]args){
        System.out.println("------- Vamos lá -------\n");
        System.out.println("------- A frase é um palíndromo? -------\n");
        System.out.println("Palíndromo: diz-se de ou frase ou palavra que se pode ler, indiferentemente, da esquerda para a direita ou vice-versa.");
        Scanner leitor = new Scanner(System.in);
        int resp = 0;
        String frase = "";
        while(resp == 2 || resp == 0){
            System.out.println("\n Digite a frase: \n");
            frase = leitor.nextLine();
               try{
            System.out.println("\n ------------------------------------------ \n");
            System.out.println("Só um instante enquanto lemos a sua frase. \n");
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Erro inesperado aconteceu.");
        }
            System.out.println("A frase: " +"( " + frase + " )" + ", esta correta?");
            System.out.println("------- 1. Sim // 2. Não -------");
            resp = leitor.nextInt();
            leitor.nextLine();
        }
        if(resp == 1){
            System.out.println("\n Ótimo, vamos lá...\n");
        try{
            System.out.println("------------------------------------------ \n");
            System.out.println("Só um instante enquanto verificamos se é um palíndromo. \n");
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Erro inesperado aconteceu.");
        }
        //REMOVER ESPAÇOS EM BRANCO
        String copy = frase;
        copy = copy.replace(" ", "").toLowerCase();
        boolean palin = false;
        String  invertida = "";
        char[] c = copy.toCharArray();
        int n = c.length;
        for(int i = n-1 ; i >= 0  ; i--){
            invertida += c[i];
        }
        
        System.out.println("\n ------------------------- " );
        System.out.println("\n Frase original: " + copy);
        System.out.println("\n ------------------------- " );
        System.out.println("\n Frase invertida: " + invertida);
        System.out.println("\n ------------------------- " );
        if(invertida.equals(copy)){
            palin = true;
            System.out.println(palin);
            System.out.println("A frase: " + "(" + frase + ")" + " é um palíndromo.");
        }else{
            System.out.println("A frase: " + "(" + frase + ")" + " não é um palíndromo.");
        }
    }
    
    }
    
}
