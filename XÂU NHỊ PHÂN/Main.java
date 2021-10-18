import java.util.*;
public class Main {
    public static long[] A = new long[1000];

    public static void fibonacil() {
        A[1] = 1;
        A[2] = 1;
        for (int i = 3; i <= 93; i++) {
            A[i] = A[i-1] + A[i-2];
        }
    }

    public static int dev(long n, long k) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (k <= A[(int)n-2]) {
            return dev(n-2, k);
        } 
        return dev(n-1, k-A[(int)n-2]);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main.fibonacil();
        int t = scan.nextInt();
        while(t-- > 0) {
            long n = scan.nextLong();
            long k = scan.nextLong();
            System.out.println(Main.dev(n, k));
        }
        scan.close();
    }
}
