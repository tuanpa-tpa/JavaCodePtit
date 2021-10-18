import java.util.List;

public class Nhom {
    private int maNhom;
    private String tenNhom;
    private List<SinhVien> list;

    public Nhom() {
    }

    public Nhom(int maNhom, List<SinhVien> list) {
        this.maNhom = maNhom;
        this.list = list;
    }

    public String getTenNhom() {
        return tenNhom;
    }

    public void setTenNhom(String tenNhom) {
        this.tenNhom = tenNhom;
    }

    public int getMaNhom() {
        return maNhom;
    }

    public void setMaNhom(int maNhom) {
        this.maNhom = maNhom;
    }

    public List<SinhVien> getList() {
        return list;
    }

    public void setList(List<SinhVien> list) {
        this.list = list;
    }
}
