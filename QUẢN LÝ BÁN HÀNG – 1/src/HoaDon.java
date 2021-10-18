import java.util.concurrent.atomic.AtomicInteger;

public class HoaDon {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String maKhachHang;
    private String maMatHang;
    private int soLuong;

    public HoaDon() {
        id = count.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    public void setMaMatHang(String maMatHang) {
        this.maMatHang = maMatHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
