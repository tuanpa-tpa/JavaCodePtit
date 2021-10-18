import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Store implements Comparable<Store> {
    private String id;
    private String name;
    private int soLuong;
    private long donGia;
    private long chietKhau;

    public Store() {

    }

    public Store(String id, String name, int soLuong, long donGia, long chietKhau) {
        this.id = id;
        this.name = name;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public long getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(long chietKhau) {
        this.chietKhau = chietKhau;
    }

    public long tongTien() {
        return soLuong * donGia - chietKhau;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d %d", id, name, soLuong, donGia, chietKhau, tongTien());
    }

    @Override
    public int compareTo(Store obj) {
        return this.tongTien() < obj.tongTien() ? 1 : -1;
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        // int t = scanner.nextInt();
        ArrayList<Store> lists = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            // System.out.println(scanner.nextLine());
            // System.out.println(scanner.nextLine());
            // System.out.println(Integer.parseInt(scanner.nextLine()));
            // System.out.println(Long.parseLong(scanner.nextLine()));
            // System.out.println(Long.parseLong(scanner.nextLine()));
            Store store = new Store();
            store.setId(scanner.nextLine());
            store.setName(scanner.nextLine());
            store.setSoLuong(Integer.parseInt(scanner.nextLine()));
            store.setDonGia(Long.parseLong(scanner.nextLine()));
            store.setChietKhau(Long.parseLong(scanner.nextLine()));
            lists.add(store);
        }
        Collections.sort(lists);
        for (Store store : lists) {
            System.out.println(store);
        }
        scanner.close();
    }
}
