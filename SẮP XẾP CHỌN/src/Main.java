import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < A.length; i++) {
			A[i] = scanner.nextInt();
		}
		for (int i = 0; i < A.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < A[minIndex]) {
					minIndex = j;
				}
			}
			int tmp = A[i];
			A[i] = A[minIndex];
			A[minIndex] = tmp;
			System.out.print(String.format("Buoc %d: ", i + 1));
			for (int e : A) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
		scanner.close();

	}

}
