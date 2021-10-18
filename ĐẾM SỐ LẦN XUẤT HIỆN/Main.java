import java.sql.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = scan.nextInt();
            LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<Integer,Integer>();
            for (int i = 0; i < n; i++) {
                int key = scan.nextInt();
                if (linkedHashMap.containsKey(key)) {
                    linkedHashMap.put(key, linkedHashMap.get(key)+1);
                } else {
                    linkedHashMap.put(key, 1);
                }
            }
            System.out.println(String.format("Test %d: ", test));
            for (Map.Entry<Integer,Integer> key : linkedHashMap.entrySet()) {
                System.out.println(String.format("%d xuat hien %d lan", key.getKey(),key.getValue()));
            }
        }
        scan.close();
    }
}