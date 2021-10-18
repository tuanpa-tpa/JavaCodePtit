import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        while (t-- > 0) {
            String str = scan.nextLine();
            long sumChan = 0;
            long sumLe = 0;
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    sumChan += (long)(str.charAt(i) - '0');
                } else {
                    sumLe += (long)(str.charAt(i) - '0');
                }
            }
            if ((sumChan - sumLe) % 11 == 0 ) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

}
