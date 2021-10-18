import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        while (t-- > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            String str = scan.nextLine();
            StringTokenizer stringToken = new StringTokenizer(str," ");
            while(stringToken.hasMoreTokens()) {
                String st = stringToken.nextToken().toLowerCase();
                stringBuffer.append(String.valueOf(st.charAt(0)).toUpperCase());
                stringBuffer.append(st.substring(1));
                stringBuffer.append(" ");

                // StringBuffer st = 
                // new StringBuffer(stringToken.nextToken().toLowerCase());
                // st.replace(0, 1, String.valueOf(st.charAt(0)).toUpperCase());
                // stringBuffer.append(st+" ");
            }
            System.out.println(stringBuffer);
        }
        scan.close();
    }
}