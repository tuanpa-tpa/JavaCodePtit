import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!st.empty()) {
                if (s.charAt(i) == st.peek()) {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            } else {
                st.push(s.charAt(i));
            }

        }
        String res = "";
        
        if (st.empty()) {
            System.out.println("Empty String");
        } else {
            while(!st.empty()) {
                res = st.pop() + res;
            }
            System.out.println(res);
        }
        scan.close();
    }
}
