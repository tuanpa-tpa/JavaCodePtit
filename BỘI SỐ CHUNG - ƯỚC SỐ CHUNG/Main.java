import java.util.Scanner;

public class Main {

    public static long gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            long _gcd = gcd(a, b);
            System.out.println(String.format("%d %d",(long)a*b/_gcd,_gcd));
        }
        scan.close();     
    }
}