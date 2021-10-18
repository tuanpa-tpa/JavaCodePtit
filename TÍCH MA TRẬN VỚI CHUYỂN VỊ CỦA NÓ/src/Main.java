import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int test = 1; test <= t; test++) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int[][] A = new int[n][m];
			int[][] B = new int[m][n];
			int[][] C = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					A[i][j] = scanner.nextInt();
					B[j][i] = A[i][j];
				}

			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					C[i][j] = 0;
					for (int j2 = 0; j2 < m; j2++) {
						C[i][j] += A[i][j2] * B[j2][j];
					}
				}
			}
			System.out.println(String.format("Test %d:", test));
			for (int[] is : C) {
				for (int is2 : is) {
					System.out.print(is2 + " ");
				}
				System.out.println();
			}

		}
		scanner.close();
	}

}
