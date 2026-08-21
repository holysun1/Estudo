package teste;

public class CharRepeat {

    public static void main(String[] args) {
        // EXEMPLO DE STRING
        String word = "ssswiss";
        //DECLARAÇÃO DE VARIÁVEIS
        char [] a = word.toCharArray();
        int n = a.length;
        for(int i = 0; i < n-1 ; i++){
            boolean rpt = false;
            if(a[i] == a[i+1]){
                rpt = true;     
        }if(!rpt){
            System.out.print(a[i+1]);
            break;
        }
    }
    }
}


