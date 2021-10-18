
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class NhanVien implements Comparable<NhanVien> {
	int id;
	String hoTen;
	String gioiTinh;
	String ngaySinh;
	String diaChi;
	String maSoThue;
	String ngayKyHD;

	public NhanVien() {

	}

	public NhanVien(int id, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue,
			String ngayKyHD) {
		this.id = id;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.maSoThue = maSoThue;
		this.ngayKyHD = ngayKyHD;
	}

	public NhanVien(NhanVien nhanVienObj1) {
		this.id = nhanVienObj1.getId();
		this.hoTen = nhanVienObj1.getHoTen();
		this.gioiTinh = nhanVienObj1.getGioiTinh();
		this.ngaySinh = nhanVienObj1.getNgaySinh();
		this.diaChi = nhanVienObj1.getDiaChi();
		this.maSoThue = nhanVienObj1.getMaSoThue();
		this.ngayKyHD = nhanVienObj1.getNgayKyHD();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
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

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public String getNgayKyHD() {
		return ngayKyHD;
	}

	public void setNgayKyHD(String ngayKyHD) {
		this.ngayKyHD = ngayKyHD;
	}

	public int getMonth() {
		String s = this.getNgaySinh();
		int day = (s.charAt(0) - '0') * 10 + s.charAt(1) - '0';
		return day;
	}

	public int getDay() {
		String s = this.getNgaySinh();
		int month = (s.charAt(3) - '0') * 10 + s.charAt(4) - '0';
		return month;
	}

	public int getYear() {
		String s = this.getNgaySinh();
		int year = (s.charAt(6) - '0') * 1000 + (s.charAt(7) - '0') * 100 + (s.charAt(8) - '0') * 10 + s.charAt(9)
				- '0';
		return year;
	}

	@Override
	public String toString() {
		return String.format("%05d %s %s %s %s %s %s", getId(), getHoTen(), getGioiTinh(), getNgaySinh(), getDiaChi(),
				getMaSoThue(), getNgayKyHD());
	}
	
	@Override
	public int compareTo(NhanVien o) {
		if (this.getYear() > o.getYear())
			return 1;
		if (this.getYear() == o.getYear() && this.getMonth() > o.getMonth())
			return 1;
		if (this.getYear() == o.getYear() && this.getMonth() == o.getMonth() && this.getDay() > o.getDay())
			return 1;
		return -1;
	}
}

public class Main {

	public static void main(String[] args) {

		ArrayList<NhanVien> nhanvienObj = new ArrayList<NhanVien>();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= t; i++) {
			int id = i;
			String hoTen = sc.nextLine();
			String gioiTinh = sc.nextLine();
			String ngaySinh = sc.nextLine();
			String diaChi = sc.nextLine();
			String maSoThue = sc.nextLine();
			String ngayKyHD = sc.nextLine();

			NhanVien nhanvienObj1 = new NhanVien(id, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHD);
			nhanvienObj.add(nhanvienObj1);

		}
		Collections.sort(nhanvienObj);
		for (NhanVien nhanVien : nhanvienObj) {
			System.out.println(nhanVien);
		}

		sc.close();
	}
}
