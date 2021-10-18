import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n];
		ArrayList<StringBuilder> list = new ArrayList<>();
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
			StringBuilder s = new StringBuilder();
			s.append(String.format("Buoc %d: ", i + 1));
			for (int e : A) {
				s.append(e + " ");
			}
			list.add(s);
		}
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
		scanner.close();

	}

}
