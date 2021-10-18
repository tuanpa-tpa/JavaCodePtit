import java.util.Scanner;

public class Main {

    public static void min(int d, int s) {
        int[] A = new int[d];
        A[0] = 1;
        s = s - 1;
        int n = d - 1;
        while (s >= 9) {
            A[n] = 9;
            s -= 9;
            n--;
        }
        A[n] += s;
        for (int i = 0; i < d; i++) {
            System.out.print(A[i]);
        }
        System.out.print(" ");
    }

    public static void max(int d, int s) {
        int[] A = new int[d];
        int n = 1;
        if (s >= 9) {
            s -= 9;
            A[0] = 9;
        } else {
            A[0] = s;
            s = 0;
        }
        while (s >= 9) {
            A[n] = 9;
            s -= 9;
            n++;
        }
        A[n] += s;
        for (int i = n + 1; i < d; i++) {
            A[i] = 0;
        }
        for (int i = 0; i < d; i++) {
            System.out.print(A[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int s = scanner.nextInt();
        if (d < 1 || s < 1 || 9 * d < s) {
            System.out.println("-1 -1");
        } else {
            min(d, s);
            max(d, s);
        }
        scanner.close();
    }

}
