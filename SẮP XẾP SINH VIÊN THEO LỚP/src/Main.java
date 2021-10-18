import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SinhVien> list = new ArrayList<>();

        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            SinhVien sv = new SinhVien();
            sv.setMsv(scanner.nextLine());
            sv.setName(scanner.nextLine());
            sv.setLop(scanner.nextLine());
            sv.setEmail(scanner.nextLine());
            list.add(sv);
        }
        list.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                int x = o1.getLop().compareToIgnoreCase(o2.getLop());
                if (x == 0) {
                    return o1.getMsv().compareToIgnoreCase(o2.getMsv());
                }
                return x;
            }
        });
        for (SinhVien i: list) {
            System.out.println(i);
        }
        scanner.close();
    }
}

/*
4
B16DCCN011
Nguyen Trong Duc Anh
D16CNPM1
sv1@stu.ptit.edu.vn
B15DCCN215
To Ngoc Hieu
D15CNPM3
sv2@stu.ptit.edu.vn
B15DCKT150
Nguyen Ngoc Son
D15CQKT02-B
sv3@stu.ptit.edu.vn
B15DCKT199
Nguyen Trong Tung
D15CQKT03-B
sv4@stu.ptit.edu.vn


B15DCCN215 To Ngoc Hieu D15CNPM3 sv2@stu.ptit.edu.vn
B15DCKT150 Nguyen Ngoc Son D15CQKT02-B sv3@stu.ptit.edu.vn
B15DCKT199 Nguyen Trong Tung D15CQKT03-B sv4@stu.ptit.edu.vn
B16DCCN011 Nguyen Trong Duc Anh D16CNPM1 sv1@stu.ptit.edu.vn

B15DCCN215 To Ngoc Hieu D15CNPM3 sv2@stu.ptit.edu.vn

B15DCKT150 Nguyen Ngoc Son D15CQKT02-B sv3@stu.ptit.edu.vn

B15DCKT199 Nguyen Trong Tung D15CQKT03-B sv4@stu.ptit.edu.vn

B16DCCN011 Nguyen Trong Duc Anh D16CNPM1 sv1@stu.ptit.edu.vn
 */