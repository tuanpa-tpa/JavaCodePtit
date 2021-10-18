import java.util.concurrent.atomic.AtomicInteger;

public class MatHang extends MatHangService {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String ten;
    private String nhom;
    private double giaMua;
    private double giaBan;
    private double loiNhuan;

    public MatHang() {
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

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public double getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(double giaMua) {
        this.giaMua = giaMua;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
        setLoiNhuan(tinhLoiNhuan(this.giaBan,this.giaMua));
    }

    public double getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(double loiNhuan) {
        this.loiNhuan = loiNhuan;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %.2f",id, ten,nhom,loiNhuan);
    }
}
