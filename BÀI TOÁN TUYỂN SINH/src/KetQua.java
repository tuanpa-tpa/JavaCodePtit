public class KetQua {
    public String ketQua(ThiSinh s) {
        if (s.getTong() + s.getKhuVuc() >= 24) {
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }
}
