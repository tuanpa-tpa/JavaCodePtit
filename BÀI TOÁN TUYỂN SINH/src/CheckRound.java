public class CheckRound {
    public boolean checkRound(double s) {
        String[] tmpKhuVuc = String.valueOf(s).split("");
        for (int i = 0; i < tmpKhuVuc.length; i++) {
            if (tmpKhuVuc[i].equals(".")) {
                if (tmpKhuVuc[i+1].equals("0")) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
