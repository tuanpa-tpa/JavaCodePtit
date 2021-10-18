import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThiSinh thiSinh = new ThiSinh();
        KetQua ketQua = new KetQua();
        KhuVuc khuVuc = new KhuVuc();
        TongDiem tongDiem = new TongDiem();
        thiSinh.setMa(scanner.nextLine());
        thiSinh.setTen(scanner.nextLine());
        thiSinh.setToan(scanner.nextDouble());
        thiSinh.setLy(scanner.nextDouble());
        thiSinh.setHoa(scanner.nextDouble());
        thiSinh.setKhuVuc(khuVuc.diemKhuVuc(thiSinh));
        thiSinh.setTong(tongDiem.tongDiem(thiSinh));
        thiSinh.setKq(ketQua.ketQua(thiSinh));
        System.out.println(thiSinh);
    }
}
