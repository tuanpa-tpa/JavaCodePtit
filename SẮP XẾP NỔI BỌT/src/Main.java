import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < A.length; i++) {
			A[i] = scanner.nextInt();
		}
		for (int i = 0; i < A.length-1; i++) {
			boolean check = false;
			for (int j = 0; j < A.length-1; j++) {
				if (A[j] > A[j+1]) {
					int tmp = A[j];
					A[j] = A[j+1];
					A[j+1] = tmp;
					check = true;
				}
			}
			if (!check) break;
			System.out.print(String.format("Buoc %d: ", i+1));
			for (int j : A) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
