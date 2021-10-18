public class KhuVuc {
    public double diemKhuVuc(ThiSinh s) {
        String str = s.getMa().substring(0,3).toUpperCase();
        switch (str) {
            case "KV1":
                return 0.5;
            case "KV2":
                return 1.0;
            default:
                return 1.5;
        }
    }
}
