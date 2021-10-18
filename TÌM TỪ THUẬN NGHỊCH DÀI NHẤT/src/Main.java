import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static boolean check(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
        String s;
        while (scanner.hasNext()) {
            s = scanner.next();
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
            } else {
                if (check(s)) {
                    hashMap.put(s, 1);
                }
            }
        }
        int max = 1;
        for(Map.Entry<String, Integer> entry: hashMap.entrySet()) {
            max = Math.max(max, entry.getKey().length());
        }
        for(Map.Entry<String, Integer> entry: hashMap.entrySet()) {
            if (entry.getKey().length() == max) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        scanner.close();
    }
}
