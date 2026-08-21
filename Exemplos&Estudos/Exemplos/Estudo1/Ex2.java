package Estudo1;

public class Ex2 {
    public static void main(String[] args) {
        //CRIAÇÃO DE VARIÁVEL PARA O EXERCÍCIO
        String frase = "CI&T Next Gen";
        frase = frase.trim();
        char[] caracteres  = frase.toCharArray();
        String invertida = "";

        for(int b = caracteres.length-1; b >= 0  ; b--){
                invertida += caracteres[b];
            }
            System.out.println(invertida);
        }
    }
