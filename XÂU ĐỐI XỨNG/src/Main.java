import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = Integer.parseInt(scanner.nextLine());
		while(t-- > 0) {
			String s = scanner.nextLine();
			int dem = 0;
			int n = s.length();
			for (int i = 0; i < n/2; i++) {
				if (s.charAt(i) != s.charAt(n-i-1)) {
					dem++;
				}
			}
			if (dem == 0) {
				if (n % 2 == 0) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}
			} else {
				if (dem != 1) {
					System.out.println("NO");
				} else {
					System.out.println("YES");
				}
			}
		}
		
		
		scanner.close();
	}
}