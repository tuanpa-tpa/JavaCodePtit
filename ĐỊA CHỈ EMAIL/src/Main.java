import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		while (t-- > 0) {
			String s = scanner.nextLine();
			s = s.trim();
			s = s.replaceAll("\\s+", " ");
			String[] fullName = s.split(" ");
			String tmp = "";
			for (int i = 0; i < fullName.length - 1; i++) {
				tmp += String.valueOf(fullName[i].charAt(0)).toLowerCase();
			}
			String str = fullName[fullName.length - 1].toLowerCase() + tmp;
			if (map.containsKey(str)) {
				map.put(str + (map.get(str)+1), map.get(str)+1);
				map.put(str , map.get(str)+1);
			} else {
				map.put(str, 1);
			}
		}
//		System.out.println(map);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
				System.out.println(entry.getKey() + "@ptit.edu.vn" );
		}
		scanner.close();
	}

}

//5
//nGUYEn    quaNG   vInH  
//tRan   thi THU    huOnG
//nGO   quoC  VINH
//lE            tuAn    aNH
//nGO   quoC  VINH
