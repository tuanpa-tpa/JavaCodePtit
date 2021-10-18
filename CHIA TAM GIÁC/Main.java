import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0) {
            int n = scan.nextInt();
            int h = scan.nextInt();
            for (int i = 1; i < n; i++) {
                System.out.print(String.format("%.6f ", h*Math.sqrt((double)i/n)));
            }
            System.out.println();
        }

        scan.close();
    }
}

 
