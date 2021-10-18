import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			String aString = scanner.next();
			String bString = scanner.next();
			if (aString.compareToIgnoreCase(bString) == 0) {
				System.out.println(-1);
			} else {
				System.out.println(Math.max(aString.length(), bString.length()));
			}
		}
		scanner.close();
	}
}
