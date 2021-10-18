import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[][] A = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				A[i][j] = scanner.nextInt();
				if (A[i][j] == 1 && i < j)
					System.out.println(String.format("(%d,%d)", i + 1, j + 1));
			}
		}

		scanner.close();
	}
}