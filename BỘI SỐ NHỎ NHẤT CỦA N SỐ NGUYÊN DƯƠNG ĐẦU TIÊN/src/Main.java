import java.util.Scanner;

public class Main {

	
	public static long gcd(long a, long b) {
		if (b == 0) return a;
		return gcd(b, a%b);
	}
	public static long lcm(long a, long b) {
		return a*b/gcd(a, b);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			long tmp = 1;
			for (int i = 1; i <= n ; i++) {
				tmp = lcm(tmp, i);
			}
			System.out.println(tmp);
		}
		scanner.close();
	}

}

