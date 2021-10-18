import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			linkedList.add(A[i]);
			Collections.sort(linkedList);
			System.out.print(String.format("Buoc %d: ", i));
			for (int e : linkedList) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}

}