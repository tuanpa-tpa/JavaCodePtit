import java.util.*;

/**
 * @author PhamAnhTuan
 */

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			long[] A = new long[n];
			for (int i = 0; i < n; i++) {
				A[i] = scanner.nextInt();
				A[i] = A[i] * A[i];
			}
			Arrays.sort(A);
			boolean check = false;
			for (int i = n - 1; i >= 2; i--) {
				int left = 0;
				int right = i - 1;
				while (left < right) {
					if (A[left] + A[right] == A[i]) {
						check = true;
						break;
					} else if (A[left] + A[right] < A[i]) {
						left++;
					} else if (A[left] + A[right] > A[i]) {
						right--;
					}
				}
				if (check) {
					System.out.println("YES");
					break;
				}

			}
			if(!check) {
				System.out.println("NO");
			}
		}
		scanner.close();
	}
}
