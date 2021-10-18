import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> arrayList = new ArrayList<Long>();
        HashMap<Long, Boolean> hashMap = new HashMap<Long, Boolean>();
        arrayList.add((long)0);
        arrayList.add((long)1);
        hashMap.put((long)1, true);
        hashMap.put((long)0, true);
        for (int i = 2; i <= 92; i++) {
            arrayList.add(arrayList.get(i-1) + arrayList.get(i-2));
            hashMap.put(arrayList.get(i), true);
        }
        int t = scanner.nextInt();
        while(t-- > 0) {
            long n = scanner.nextLong();
            if (hashMap.containsKey((long)n) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}