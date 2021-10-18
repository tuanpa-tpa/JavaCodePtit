import java.text.SimpleDateFormat;
import java.util.*;

class SinhVien implements Comparable<SinhVien> {
	private int id;
	private String name;
	private String birthDay;
	private String className;
	private float gpa;

	public SinhVien() {
		this(0, "", "", "", 0);
	}

	public SinhVien(int id, String name, String birthDay, String className, float gpa) {
		this.id = id;
		this.name = name;
		this.birthDay = birthDay;
		this.className = className;
		this.gpa = gpa;
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

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public void convertBirthDay() {
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = (Date) simpleDateFormat.parse(birthDay);
			birthDay = simpleDateFormat.format(date);
		} catch (Exception e) {

		}
	}

	public void convertName() {
		StringTokenizer stringTokenizer = new StringTokenizer(name);
		StringBuilder stringBuilder = new StringBuilder();
		while (stringTokenizer.hasMoreTokens()) {
			String str = stringTokenizer.nextToken().toLowerCase();
			stringBuilder.append(String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1) + " ");
		}
		name = stringBuilder.toString();
	}
	
	
	@Override
	public int compareTo(SinhVien o) {
		return this.getGpa() < o.getGpa() ? 1 : -1;
	}
	

	@Override
	public String toString() {
		convertName();
		convertBirthDay();
		return String.format("B20DCCN%03d %s%s %s %.2f", id, name, className, birthDay, gpa);
	}
}

public class Main {

	public static void main(String[] args) {
		ArrayList<SinhVien> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		for (int i = 1; i <= t; i++) {
			SinhVien sinhVien = new SinhVien();
			sinhVien.setId(i);
			sinhVien.setName(scanner.nextLine());
			sinhVien.setClassName(scanner.nextLine());
			sinhVien.setBirthDay(scanner.nextLine());
			sinhVien.setGpa(Float.parseFloat(scanner.nextLine()));
			list.add(sinhVien);
		}
		Collections.sort(list);
		for (SinhVien sinhVien : list) {
			System.out.println(sinhVien);
		}
		
		scanner.close();
	}

}
