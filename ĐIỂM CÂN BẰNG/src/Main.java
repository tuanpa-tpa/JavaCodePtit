import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int[] a = new int[n];
			long sum1 = 0;
			long sum2 = 0;
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}
			for (int i = 1; i < n; i++) {
				sum1 = sum1 + a[i];
			}

			boolean check = false;
			for (int i = 0, j = 1; j < n; j++, i++) {
				sum2 = sum2 + a[i];
				sum1 = sum1 - a[j];
				if (sum1 == sum2) {
					System.out.println(j + 1);
					check = true;
					break;
				}
			}
			if (check == false) {
				System.out.println(-1);
			}
		}
		scanner.close();
	}

}
