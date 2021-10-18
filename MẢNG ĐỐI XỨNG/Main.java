import java.util.*;

public class Main {
    public static boolean check(int n, ArrayList<Integer> A) {
        int i = 0, j = n - 1;
        try {
            while(A.get(i) == A.get(j)) {
                i++;
                j--;
            }
        } catch (Exception e) {
            // System.out.println(e);
        }
        return i > j;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(scan.nextInt());
            }
            if (check(n,list)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
    }   
}