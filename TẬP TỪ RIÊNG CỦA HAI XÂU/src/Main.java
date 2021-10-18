import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		while (t-- > 0) {
			TreeMap<String, Integer> tMap = new TreeMap<>();
			String s1 = scanner.nextLine();
			String s2 = scanner.nextLine();
			StringTokenizer s1Tokenizer = new StringTokenizer(s1);
			while (s1Tokenizer.hasMoreTokens()) {
				tMap.put(s1Tokenizer.nextToken(), 1);
			}

			StringTokenizer s2Tokenizer = new StringTokenizer(s2);
			while (s2Tokenizer.hasMoreTokens()) {
				String str = s2Tokenizer.nextToken();
				if (tMap.containsKey(str)) {
					tMap.put(str, tMap.get(str) + 1);
				}
			}
			for (Map.Entry<String, Integer> res : tMap.entrySet()) {
				if (res.getValue() == 1) {
					System.out.print(res.getKey() + " ");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}

//2
//abc ab ab ab abcd
//ab abc
//aaa xyz ab zzz abc dd dd abc
//xyz dd ttt sas cdc
