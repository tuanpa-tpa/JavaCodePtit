import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n];
		ArrayList<StringBuilder> list = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			A[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			linkedList.add(A[i]);
			Collections.sort(linkedList);
			StringBuilder s = new StringBuilder();
			s.append(String.format("Buoc %d: ", i));
			for (int e : linkedList) {
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
