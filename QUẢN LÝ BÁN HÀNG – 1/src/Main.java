import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, KhachHang> khachHangList = new HashMap<>();
        Map<String, MatHang> matHangList = new HashMap<>();
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            KhachHang khachHang = new KhachHang();
            khachHang.setTen(scanner.nextLine());
            khachHang.setGioiTinh(scanner.nextLine());
            khachHang.setNgaySinh(scanner.nextLine());
            khachHang.setDiaChi(scanner.nextLine());
            khachHangList.put(String.format("KH%03d", khachHang.getId()), khachHang);
        }
        t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            MatHang matHang = new MatHang();
            matHang.setTen(scanner.nextLine());
            matHang.setDonVi(scanner.nextLine());
            matHang.setGiaMua(Integer.parseInt(scanner.nextLine()));
            matHang.setGiaBan(Integer.parseInt(scanner.nextLine()));
            matHangList.put(String.format("MH%03d", matHang.getId()), matHang);
        }
        t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            HoaDon hoaDon = new HoaDon();
            String[] str = scanner.nextLine().split(" ");
            hoaDon.setMaKhachHang(str[0]);
            hoaDon.setMaMatHang(str[1]);
            hoaDon.setSoLuong(Integer.parseInt(str[2]));
            System.out.print(String.format("HD%03d ", hoaDon.getId()));
            System.out.print(khachHangList.get(hoaDon.getMaKhachHang()));
            System.out.print(matHangList.get(hoaDon.getMaMatHang()));
            System.out.print(hoaDon.getSoLuong() + " ");
            System.out.println(matHangList.get(hoaDon.getMaMatHang()).getGiaBan() * hoaDon.getSoLuong());
        }
        scanner.close();
    }
}

/*
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4
HD001 Nguyen Van Nam Mo Lao-Ha Dong-Ha Noi Ao phong tre em Cai 25000 41000 2 82000
HD002 Nguyen Van Nam Mo Lao-Ha Dong-Ha Noi Ao khoac nam Cai 240000 515000 3 1545000
HD003 Tran Van Binh Phung Khoang-Nam Tu Liem-Ha Noi Ao khoac nam Cai 240000 515000 4 2060000
HD001 Nguyen Van Nam Mo Lao-Ha Dong-Ha Noi Ao phong tre em Cai 25000 41000 2 82000
HD002 Nguyen Van Nam Mo Lao-Ha Dong-Ha Noi Ao khoac nam Cai 240000 515000 3 1545000
HD003 Tran Van Binh Phung Khoang-Nam Tu Liem-Ha Noi Ao khoac nam Cai 240000 515000 4 2060000
 */