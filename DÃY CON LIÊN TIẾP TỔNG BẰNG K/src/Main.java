import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            boolean[] A = new boolean[1000000];
            for (int i = 0; i < n; i++) {
                int tmp = scanner.nextInt();
                A[tmp] = true;
                for (long j = k; j >= tmp ;j--) {
                    if (A[(int)k]) break;
                    if (A[(int)j - tmp]) {
                        A[(int)j] = true;
                    }
                }
            }
            if (A[(int)k]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
