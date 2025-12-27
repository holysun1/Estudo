import java.util.Arrays;

public class IsAnagram {
    public static boolean isAnagram(String s, String t){
        // DEFINIÇÃO PARA CONDIÇÃO DE RETURN FALSE
        if(s.length() != t.length()) return false;

        // CONVERTER STRINGS EM ARRAYS DE CARACTERES
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        //ORDENAR OS ARRAYS EM ORDEM CRESCENTE
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }
    public static void main(String[] args){
        System.out.println(isAnagram("listen", "silent"));
    }
}
