public class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String soDienThoai;
    private int soThuTuNhom;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, String soDienThoai, int soThuTuNhom) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soThuTuNhom = soThuTuNhom;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getSoThuTuNhom() {
        return soThuTuNhom;
    }

    public void setSoThuTuNhom(int soThuTuNhom) {
        this.soThuTuNhom = soThuTuNhom;
    }

    @Override
    public String toString() {
        return maSinhVien + " " + hoTen + " " + soDienThoai;
    }
}
