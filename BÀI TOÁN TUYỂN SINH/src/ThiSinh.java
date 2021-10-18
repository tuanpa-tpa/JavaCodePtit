public class ThiSinh {
    private String ma;
    private String ten;
    private double toan;
    private double ly;
    private double hoa;
    private double tong;
    private double khuVuc;
    private String kq;

    public ThiSinh() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getKhuVuc() {
        return khuVuc;
    }

    public void setKhuVuc(double khuVuc) {
        this.khuVuc = khuVuc;
    }

    public String getKq() {
        return kq;
    }

    public void setKq(String kq) {
        this.kq = kq;
    }

    public double getTong() {
        return tong;
    }

    public void setTong(double tong) {
        this.tong = tong;
    }

    @Override
    public String toString() {
        CheckRound checkRound = new CheckRound();
        String toKhuVuc = checkRound.checkRound(khuVuc) ? String.valueOf((int)khuVuc) : String.format("%.1f",khuVuc);
        String toTong = checkRound.checkRound(tong) ? String.valueOf((int)tong) : String.format("%.1f",tong);
        return ma + " " + ten + " " + toKhuVuc + " " + toTong + " " + kq;
    }

}
