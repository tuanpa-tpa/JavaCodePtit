import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        List<MatHang> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            MatHang matHang =  new MatHang();
            matHang.setTen(scanner.nextLine());
            matHang.setNhom(scanner.nextLine());
            matHang.setGiaMua(Double.parseDouble(scanner.nextLine()));
            matHang.setGiaBan(Double.parseDouble(scanner.nextLine()));
            list.add(matHang);
        }
        list.sort(new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                return o1.getLoiNhuan() < o2.getLoiNhuan() ? 1 : -1;
            }
        });
        for (MatHang i : list) {
            System.out.println(i);
        }
        scanner.close();
    }
}
