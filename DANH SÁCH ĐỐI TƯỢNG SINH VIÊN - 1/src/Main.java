import java.text.SimpleDateFormat;
import java.util.*;

class SinhVien {
    private static int msv;
    private String name;
    private String ngaySinh;
    private String lop;
    private double diem;

    public SinhVien() {
        this("", "01/01/2001", "", 0);
        msv += 1;
    }

    public SinhVien(String name, String ngaySinh, String lop, double diem) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.diem = diem;
    }


    public static int getMsv() {
        return msv;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

}

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);;
        SimpleDateFormat fromUser = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fdate = new SimpleDateFormat("dd/MM/yyyy");
        int t = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < t; i++) {
            SinhVien sinhVien = new SinhVien();
            sinhVien.setName(scan.nextLine());
            sinhVien.setLop(scan.nextLine());
            sinhVien.setNgaySinh(scan.nextLine());
            sinhVien.setDiem(Double.parseDouble(scan.nextLine()));
            // format ngay sinh 
            String ngaySinh = sinhVien.getNgaySinh();
            Date date = fromUser.parse(ngaySinh);
            ngaySinh = fdate.format(date);
            // ket qua
            String res = String.format("B20DCCN%03d %s %s %s %.2f", SinhVien.getMsv(),
            sinhVien.getName() , sinhVien.getLop(), ngaySinh, sinhVien.getDiem());
            System.out.println(res);
        }

        scan.close();
    }
}
