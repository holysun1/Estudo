public class ClimbStairs {
    
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int a = 1;  // resultado para n=1
        int b = 2;  // resultado para n=2
        int c = 0;

        for (int i = 3; i <= n; i++) {
            c = a + b; // fibonacci
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        ClimbStairs cs = new ClimbStairs();
        int n = 5;
        System.out.println("Número de maneiras de subir " + n + " degraus: " + cs.climbStairs(n));
    }
}
