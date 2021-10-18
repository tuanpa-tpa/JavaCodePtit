
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Long> list = new ArrayList<Long>();
            list.add((long)1);
            list.add((long)1);
            for (int i = 2; i <= 92; i++) {
                list.add(list.get(i-1) + list.get(i-2));
            }
            System.out.println(list.get(n-1));
        }
        scan.close();
    }
}
