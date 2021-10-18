import java.util.*;

class NhanVien {
    private String name;
    private String sex;
    private String birthDay;
    private String address;
    private String number;
    private String contractDate;
    
    
    public NhanVien() {
    	
    }
    
	public NhanVien(String name, String sex, String birthDay, String address, String number, String contractDate) {
		this.name = name;
		this.sex = sex;
		this.birthDay = birthDay;
		this.address = address;
		this.number = number;
		this.contractDate = contractDate;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getContractDate() {
		return contractDate;
	}
	public void setContractDate(String contractDate) {
		this.contractDate = contractDate;
	}

	
	@Override
	public String toString() {
		return String.format("00001 %s %s %s %s %s %s", name, sex, birthDay, address, number, contractDate);
	}

}

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien = new NhanVien();
        nhanVien.setName(scanner.nextLine());
        nhanVien.setSex(scanner.nextLine());
        nhanVien.setBirthDay(scanner.nextLine());
        nhanVien.setAddress(scanner.nextLine());
        nhanVien.setNumber(scanner.nextLine());
        nhanVien.setContractDate(scanner.nextLine());
        System.out.println(nhanVien);
        scanner.close();
    }
}





