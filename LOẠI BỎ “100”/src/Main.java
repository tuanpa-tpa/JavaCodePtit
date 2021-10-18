import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		while (t-- > 0) {
			StringBuilder s = new StringBuilder(scanner.next());
			int res = 0;
			int n = s.length();
			for (int i = 0; i < n - 3; i++) {
				if (s.charAt(i) == '1' && s.charAt(i + 1) == '0' && s.charAt(i + 2) == '0' && s.charAt(i + 3) == '1') {
					s.delete(i, i + 2);
					res += 3;
					i--;
					n = s.length();
				}
			}
			
			if (s.charAt(n - 3) == '1' && s.charAt(n - 2) == '0' && s.charAt(n - 1) == '0') {
				res += 3;
			}
			System.out.println(res);
		}
		scanner.close();
	}
}
