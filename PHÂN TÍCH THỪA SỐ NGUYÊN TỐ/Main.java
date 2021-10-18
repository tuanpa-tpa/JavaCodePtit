import java.util.*;
public class Main {
    public static void phanTich(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            boolean check = false;
            int dem = 0;
            while(n % i == 0 ) {
                check = true;
                n /= i;
                dem++;
            }
            if (check) {
                System.out.print(String.format("%d(%d) ", i,dem));
            }
        }
        if (n > 2) System.out.print(String.format("%d(%d)", n,1));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            System.out.print(String.format("Test %d: ", i));
            int n = scan.nextInt();
            phanTich(n);
            System.out.println();
        }
        scan.close();
        
    }
}
