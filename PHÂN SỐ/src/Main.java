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
		Scanner scanner = new Scanner(System.in);
		setA(scanner.nextLong());
		setB(scanner.nextLong());
		scanner.close();
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

	@Override
	public String toString() {
		return String.format("%d/%d", a, b);
	}

}

public class Main {

	public static void main(String[] args) {
		PhanSo p = new PhanSo(1, 1);
		p.nhap();
		p.rutGon();
		System.out.println(p);
	}

}
