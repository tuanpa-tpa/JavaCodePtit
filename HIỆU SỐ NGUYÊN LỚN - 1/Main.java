import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0) {
            String s1 = input.next();
            String s2 = input.next();
            while(s1.length() < s2.length()) s1 = '0' + s1;
            while(s1.length() > s2.length()) s2 = '0' + s2;
            if(s1.compareToIgnoreCase(s2) < 0) {
                String temp = s1;
                s1 = s2;
                s2 = temp;
            }
            int du = 0;
            
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = s1.length() - 1; i >= 0; i--) {
                int tmp = (s1.charAt(i) - '0') - (s2.charAt(i) - '0') - du;
                int s =  tmp;
                if(s < 0) {
                    s = tmp + 10;
                    du = 1;
                }
                else {
                    s = tmp;
                    du = 0;
                }
                arr.add(s);
            }
            for (int i = arr.size() - 1; i >= 0; i--) {
                System.out.print(arr.get(i));
            }
            System.out.println();
        }
    }
}