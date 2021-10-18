import java.util.Scanner;

public class Main {

    public static long P;
    public static long power(long a, long b) {
        a %= P;
        long res = 1;
        while(b > 0) {
            if (b % 2 != 0) {
                res = (res*a)%P;
            } 
            b /= 2;
            a = (a*a)%P;
        }
        return res;    
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main.P = (long)(1e9+7);
        long a, b;
        for (int i = 1; i <= 20; i++) {
            a = scan.nextLong();
            b = scan.nextLong();
            if (a == 0 && b == 0) break;
            System.out.println(power(a, b));
        }

        scan.close();
    }
}
