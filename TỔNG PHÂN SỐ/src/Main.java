import java.util.Scanner;

class PhanSo {
	private long a;
	private long b;

	public PhanSo() {

	}

	public PhanSo(long a, long b) {
		this.a = a;
		this.b = b;
	}
	
	public static Scanner scanner = new Scanner(System.in);
	
	public long getA() {
		return a;
	}

	public void setA(long a) {
		this.a = a;
	}

	public long getB() {
		return b;
	}

	public void setB(long b) {
		this.b = b;
	}

	public void nhap() {
		
		setA(scanner.nextLong());
		setB(scanner.nextLong());
	}

	public long gcd(long a, long b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public void rutGon() {
		long tmp = gcd(a, b);
		a /= tmp;
		b /= tmp;
	}
	
	public PhanSo addPhanSo(PhanSo o) {
		long a = this.a * o.b + this.b * o.a;
		long b = this.b * o.b;
		return new PhanSo(a,b);
	}

	@Override
	public String toString() {
		return String.format("%d/%d", a, b);
	}

}

public class Main {

	public static void main(String[] args) {
		PhanSo p1 = new PhanSo(1,1);
		p1.nhap();
		PhanSo p2 = new PhanSo(1,1);
		p2.nhap();
		PhanSo p = p1.addPhanSo(p2);
		p.rutGon();
		System.out.println(p);
	}

}
