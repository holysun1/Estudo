import java.util.Arrays;

public class CountChar {
    public static void main(String[] args){
        // DEFINIÇÃO DE VARIÁVEL
        String [] words = {"banana"};
        char [] letra = words[0].toCharArray();
        int n = letra.length;
        int [] count = new int [n];

        // DEFINIÇÃO DE LOOP
        for(int i = 0; i < n ; i++){
            boolean rpt = false;
            //DEFINIÇÃO DE CONDIÇÃO
            for(int j = 0 ; j < i ; j++){
                    if(letra[i] == letra[j]){
                    rpt = true;
                    break;
                }
            }
            if(rpt)
                continue;// conta repetição
            for(int k = 0; k < n; k++){
                if(letra[i] == letra[k]){
                    count[i]++;
                }
            }
            System.out.println("A letra " + letra[i] + " se repete " + count[i] + " vez(es).");

        }
    }
}
