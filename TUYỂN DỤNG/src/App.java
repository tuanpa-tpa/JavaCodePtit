import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class NhanVien implements Comparable<NhanVien> {
    private int id;
    private String ten;
    private double diemLT;
    private double diemTH;

    public NhanVien() {

    }

    public NhanVien(String ten, double diemLT, double diemTH) {
        this.ten = ten;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        if (diemLT > 10) {
            diemLT /= 10;
        }
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        if (diemTH > 10) {
            diemTH /= 10;
        }
        this.diemTH = diemTH;
    }

    public double diemTB() {
        return (diemLT+diemTH)/2;
    }


    @Override
    public String toString() {
        double avg = Math.round(diemTB()*10.0)/10.0;
        String s;
        if (avg > 9.5) {
            s = "XUAT SAC";
        } else if (avg > 8) {
            s = "DAT";
        } else if (avg > 5) {
            s = "CAN NHAC";
        } else {
            s = "TRUOT";
        }
        if (avg == 10) {
            return String.format("TS%02d %s %.1f %s", id,ten,avg,s);    
        }
        return String.format("TS%02d %s %.2f %s", id,ten,avg,s);
    }

    @Override
    public int compareTo(NhanVien o) {
        if (this.diemTB() > o.diemTB()) {
            return -1;
        }
        if (this.diemTB() == o.diemTB() && this.getId() < o.getId() ) {
            return -1;
        }
        return 1;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        ArrayList<NhanVien> lists = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            NhanVien nhanVien = new NhanVien();
            nhanVien.setId(i);
            nhanVien.setTen(scanner.nextLine());
            nhanVien.setDiemLT(Double.parseDouble(scanner.nextLine()));
            nhanVien.setDiemTH(Double.parseDouble(scanner.nextLine()));
            lists.add(nhanVien);
        }
        Collections.sort(lists);
        for (NhanVien nhanVien : lists) {
            System.out.println(nhanVien);
        }
        scanner.close();
    }
}
