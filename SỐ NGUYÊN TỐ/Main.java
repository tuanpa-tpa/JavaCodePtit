import java.util.*;
public class Main {

    public static boolean checkPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0) {
            int n = scan.nextInt();
            if (checkPrime(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }
}
