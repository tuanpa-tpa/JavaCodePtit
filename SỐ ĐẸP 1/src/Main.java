import java.util.Scanner;

public class Main {

	public static boolean checkThuanNghich(String s) {
		for (int k = 0; k <= s.length()/2; k++) {
			if (s.charAt(k) != s.charAt(s.length() - k - 1)) {
				return false;
			}
		}
		return true;
	}

	public static String getCheck(String s) {

		if (!checkThuanNghich(s))
			return "NO";

		for (int i = 0; i < s.length(); i++) {
			if ((int) (s.charAt(i) - '0') % 2 != 0) {
				return "NO";
			}
		}
		return "YES";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.next());
		while (t-- > 0) {
			String s = scanner.next();
			System.out.println(getCheck(s));
		}
		scanner.close();
	}

}
