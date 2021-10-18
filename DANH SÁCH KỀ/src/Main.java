import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(String.format("List(%d) = ", i));
			for (int j = 1; j <= n; j++) {
				int x = scanner.nextInt();
				if (x == 1) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

		scanner.close();
	}
}