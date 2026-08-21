import java.util.HashSet;

public class MissingNumber {
    
    public static int missingNumber(int[] nums){
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i=0; i <= n; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }


    public static void main(String [] args){
        int [] array = {3,0,1,2,6,7,9};
        System.out.println("Faltando: " + missingNumber(array));

    }
}
