import java.util.Arrays;

public class Prefix {
    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        
        if (words == null || words.length == 0) {
            System.out.println("");
            return;
        }

        // 1. Começamos assumindo que o prefixo é a primeira palavra inteira
        String prefixo = words[0];

        // 2. Percorremos o restante das palavras (da segunda em diante)
        for (int i = 1; i < words.length; i++) {
            
            // Enquanto a palavra atual NÃO começar com o prefixo
            // indexOf retorna 0 se a string começa com o prefixo
            while (words[i].indexOf(prefixo) != 0) {
                
                // Diminuímos o prefixo em uma letra no final
                prefixo = prefixo.substring(0, prefixo.length() - 1);
                
                // Se o prefixo ficar vazio, não há nada em comum
                if (prefixo.isEmpty()) {
                    System.out.println("Nenhum prefixo comum.");
                    return;
                }
            }
            System.out.println("Comparando com " + words[i] + ", prefixo atual: " + prefixo);
        }

        System.out.println("\nRESULTADO FINAL: " + prefixo);
    }
}