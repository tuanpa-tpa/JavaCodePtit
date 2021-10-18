import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
    
        while(t-->0){
            String s = sc.nextLine().toLowerCase().trim();
            String [] tmp = s.split("\\s+");
            String res = "";
            res += tmp[tmp.length-1].substring(0);
            for(int i=0;i<tmp.length-1;i++)
                res += tmp[i].substring(0,1);
            res += "@ptit.edu.vn";
            System.out.println(res);
        }
    }
}
