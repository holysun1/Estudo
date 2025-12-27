package teste;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args){
        //ARRAYS DE EXEMPLO
        String array1 = "listen";
        String array2 = "silent";
        //DEFINIÇÃO DE VARIÁVEL
        boolean anagram = false;

        if(array1.length() != array2.length()){ anagram= false; 
            }else{
        char [] a =  array1.toCharArray();
        char [] b = array2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        anagram =  Arrays.equals(a,b);
        System.out.println(anagram);
            }
    }  
}
