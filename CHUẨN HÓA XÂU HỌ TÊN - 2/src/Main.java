import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		while(t-- > 0) {
			String s = new String();
			s = scanner.nextLine();
			ArrayList<String> list = new ArrayList<>();
			StringTokenizer stringTokenizer = new StringTokenizer(s);
			while (stringTokenizer.hasMoreTokens()) {
				String tmpString = stringTokenizer.nextToken().toLowerCase();
				list.add(String.valueOf(tmpString.charAt(0)).toUpperCase() + tmpString.substring(1));
			}
			int n = list.size();
			for (int i = 1; i < n-1; i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println(String.format("%s, %s", list.get(n-1), list.get(0).toUpperCase()));
			
		}
		scanner.close();
	}

}


//4
//nGUYEn    quaNG   vInH  
//tRan   thi THU    huOnG
//nGO   quoC  VINH
//lE            tuAn    aNH