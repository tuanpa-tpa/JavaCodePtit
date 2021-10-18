import java.util.Scanner;

public class Main {

	public static int mod(String n, int k) {
		int res = 0;
		for (int i = 0; i < n.length(); i++) {
			res = (res*10 + (int) (n.charAt(i) - '0')) % k;
		}
		return res % k;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			String n = scanner.next();
			int mod = mod(n, 4);
			int ans = (1 + (int) Math.pow(2, mod) + (int) Math.pow(3, mod) + (int) Math.pow(4, mod));
			System.out.println(ans % 5);
		}
		scanner.close();
	}
}
