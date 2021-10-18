import java.util.Scanner;

// @author PhamAnhTuan
public class Main {

	public static int uocSo(int n) {
		int res = 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i % 2 == 0 ) res++;
				if (n/i % 2 == 0) res++;
				if (i == n/i) res--;
			}
		}
		if (n % 2 == 0) res++;
		return res > 0 ? res : 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			System.out.println(uocSo(n));
		}
		scanner.close();
	}

}
