import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soSinhVien = scanner.nextInt();
        int soNhom = scanner.nextInt();
        scanner.nextLine();
        List<SinhVien> listSinhVien = new ArrayList<>();
        for (int i = 0; i < soSinhVien; i++) {
            SinhVien sinhVien = new SinhVien();
            sinhVien.setMaSinhVien(scanner.nextLine());
            sinhVien.setHoTen(scanner.nextLine());
            sinhVien.setSoDienThoai(scanner.nextLine());
            sinhVien.setSoThuTuNhom(Integer.parseInt(scanner.nextLine()));
            listSinhVien.add(sinhVien);
        }
        Map<Integer,Nhom> listNhom = new HashMap<>();
        for (int i = 1; i <= soNhom; i++) {
            Nhom nhom = new Nhom();
            nhom.setTenNhom(scanner.nextLine());
            nhom.setMaNhom(i);
            List<SinhVien> tmp = listSinhVien.stream()
                    .filter(x -> x.getSoThuTuNhom() == nhom.getMaNhom())
                    .collect(Collectors.toList());
            nhom.setList(tmp);
            listNhom.put(i,nhom);
        }
        int query = scanner.nextInt();
        for (int i = 1; i <= query; i++) {
            Nhom nhom = listNhom.get(i);
            List<SinhVien> tmp = nhom.getList();
            if (tmp != null && !tmp.isEmpty()) {
                System.out.println(String.format("DANH SACH NHOM %d:",i));
                for (SinhVien sv: tmp) {
                    System.out.println(sv);
                }
                System.out.println(String.format("Bai tap dang ky: %s",nhom.getTenNhom()));
            }
        }
        scanner.close();
    }
}

/*
DANH SACH NHOM 1:
B17DTCN001 Nguyen Chi  Linh 0987345543
B17DTCN011 Vu Viet Thang 0981234567
B17DTCN023 Pham Trong Thang 0992123456
Bai tap dang ky: Xay dung website ban dien thoai truc tuyen

DANH SACH NHOM 1:
B17DTCN001 Nguyen Chi  Linh 0987345543
B17DTCN011 Vu Viet Thang 0981234567
B17DTCN023 Pham Trong Thang 0992123456
Bai tap dang ky: Xay dung website ban dien thoai truc tuyen
 */