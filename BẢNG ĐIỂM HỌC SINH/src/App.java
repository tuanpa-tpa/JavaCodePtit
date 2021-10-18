import java.util.*;

class HocSinh {
    private float diem;
    private int id;
    private String name;

    public HocSinh() {

    }

    public HocSinh(float diem, int id, String name) {
        this.diem = diem;
        this.id = id;
        this.name = name;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String s;
        if (diem >= 9.0) {
            s = "XUAT SAC";
        } else if (diem >= 8.0) {
            s = "GIOI";
        } else if (diem >= 7.0) {
            s = "KHA";
        } else if (diem >= 5.0) {
            s = "TB";
        } else {
            s = "YEU";
        }
        return String.format("HS%02d %s %.1f %s", id, name, diem, s);
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<HocSinh> lists = new ArrayList<HocSinh>();
        int t = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= t; i++) {
            HocSinh hocSinh = new HocSinh();
            hocSinh.setId(i);
            hocSinh.setName(scan.nextLine());
            String arr = scan.nextLine();
            String[] A = arr.split("\\s+");
            float diemTB = 0;
            for (String string : A) {
                diemTB += Float.parseFloat(string);
            }
            diemTB += Float.parseFloat(A[0]) + Float.parseFloat(A[1]);
            hocSinh.setDiem(Math.round(diemTB/12 *(float)10.0)/(float)10.0);
            lists.add(hocSinh);
        }


        Collections.sort(lists, new Comparator<HocSinh>() {
            public int compare(HocSinh hs1, HocSinh hs2) {
                if (hs1.getDiem() > hs2.getDiem()) {
                    return -1;
                }
                if (hs1.getDiem() == hs2.getDiem() && hs1.getId() < hs2.getId()) {
                    return -1;
                }
                return 1;
            }
        });
        for (HocSinh hocSinh : lists) {
            System.out.println(hocSinh);
        }
        scan.close();
    }
}
