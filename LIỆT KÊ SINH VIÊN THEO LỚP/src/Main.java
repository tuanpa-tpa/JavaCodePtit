import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            SinhVien sinhVien = new SinhVien();
            sinhVien.setMsv(scanner.nextLine());
            sinhVien.setName(scanner.nextLine());
            sinhVien.setLop(scanner.nextLine());
            sinhVien.setEmail(scanner.nextLine());
            list.add(sinhVien);
        }
        t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            String str = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+str+":");
            for (SinhVien sv: list) {
                if (sv.getLop().equalsIgnoreCase(str)){
                    System.out.println(sv);
                }
            }
        }
    }
}
