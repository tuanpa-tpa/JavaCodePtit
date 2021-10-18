import java.util.concurrent.atomic.AtomicInteger;

public class KhachHang {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public KhachHang() {
        id = count.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return ten + " " + diaChi + " ";
    }
}
