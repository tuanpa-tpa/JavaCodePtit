import java.util.Scanner;

class SinhVien {
	private String name;
	private String birthDay;
	private float mon1;
	private float mon2;
	private float mon3;

	public SinhVien() {

	}

	public SinhVien(String name, String birthDay, float mon1, float mon2, float mon3) {
		this.name = name;
		this.birthDay = birthDay;
		this.mon1 = mon1;
		this.mon2 = mon2;
		this.mon3 = mon3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public float getMon1() {
		return mon1;
	}

	public void setMon1(float mon1) {
		this.mon1 = mon1;
	}

	public float getMon2() {
		return mon2;
	}

	public void setMon2(float mon2) {
		this.mon2 = mon2;
	}

	public float getMon3() {
		return mon3;
	}

	public void setMon3(float mon3) {
		this.mon3 = mon3;
	}

	@Override
	public String toString() {
		return String.format("%s %s %.1f", name, birthDay, mon1 + mon2 + mon3);
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SinhVien sinhVien = new SinhVien();
		sinhVien.setName(scanner.nextLine());
		sinhVien.setBirthDay(scanner.nextLine());
		sinhVien.setMon1(scanner.nextFloat());
		sinhVien.setMon2(scanner.nextFloat());
		sinhVien.setMon3(scanner.nextFloat());
		System.out.println(sinhVien);
		scanner.close();
	}
}


