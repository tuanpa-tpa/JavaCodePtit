import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static int sum(int a, String b) {
		int res = 0;
		for (int i = 0; i < b.length(); i++) {
			res = (res*10 + (int)(b.charAt(i) - '0')) % a;
		}
		return res;
	}
	
	public static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int a = scanner.nextInt();
			String b = scanner.next();
			int c = sum(a, b);
			System.out.println(gcd(a, c));
		}
		scanner.close();
	}

}

