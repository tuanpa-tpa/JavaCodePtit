import java.text.*;
import java.util.Date;
import java.util.Scanner;

class SinhVien {
	private String id;
	private String name;
	private String className;
	private String birthDay;
	private float GPA;

	public SinhVien() {
	this("", "", "", 0);
	}
	
	public SinhVien(String name, String className, String birthDay, float gPA) {
		this.name = name;
		this.className = className;
		this.birthDay = birthDay;
		GPA = gPA;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public float getGPA() {
		return GPA;
	}

	public void setGPA(float gPA) {
		GPA = gPA;
	}

	public void convertBirthDay()  {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = dateFormat.parse(birthDay);
			birthDay = dateFormat.format(date);			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public String toString() {
		return String.format("B20DCCN001 %s %s %s %.2f", name, className, birthDay, GPA);
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SinhVien sinhVien = new SinhVien();
		
		sinhVien.setName(scanner.nextLine());
		sinhVien.setClassName(scanner.nextLine());
		sinhVien.setBirthDay(scanner.nextLine());
		sinhVien.setGPA(scanner.nextFloat());
		sinhVien.convertBirthDay();			
		System.out.println(sinhVien);
		scanner.close();
	}

}


