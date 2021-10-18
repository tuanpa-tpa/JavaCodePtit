import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			BigInteger a = new BigInteger(scanner.next());
			BigInteger b = new BigInteger(scanner.next());
			System.out.println(a.add(b));

		}
		scanner.close();
	}

}
