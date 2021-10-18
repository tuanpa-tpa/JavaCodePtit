import java.util.concurrent.atomic.AtomicInteger;

public class MatHang {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String ten;
    private String donVi;
    private int giaMua;
    private int giaBan;

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

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(int giaMua) {
        this.giaMua = giaMua;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return
                ten + ' ' +
                        donVi + ' ' +
                        giaMua + " " +
                        giaBan +
                        ' ';
    }
}
