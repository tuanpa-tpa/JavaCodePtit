import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			long n = scanner.nextLong();
			long max = -1;
			for (int i = 2; i <= Math.sqrt(n); i++) {
				while (n % i == 0) {
					if (i > max)
						max = i;
					n /= i;
				}
			}
			if (n != 1)
				max = Math.max(max, n);
			System.out.println(max);
		}
		scanner.close();
	}
}
