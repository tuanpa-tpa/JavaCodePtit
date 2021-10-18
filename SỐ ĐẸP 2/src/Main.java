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
		if (s.charAt(0) != '8' && s.charAt(s.length()-1) != '8') 
			return "NO";
		
		long sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += (long)(s.charAt(i) - '0');
		}
		
		return sum % 10 == 0 ? "YES" : "NO";
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
