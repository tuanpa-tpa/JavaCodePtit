import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static int n = scanner.nextInt();
	static int k = scanner.nextInt();
	static int[] A = new int[k+1];
	static int dem;
	
	public static void xuat() {
		for (int i = 1; i <= k; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void sinhToHop(int i) {
		for (int j = A[i-1]+1; j <= n-k+i; j++) {
			A[i] = j;
			if (i == k) {
				dem++;
				xuat();
			} else {
				sinhToHop(i+1);
			}
		}
	}
	
	
	public static void main(String[] args) {
		dem = 0;
		sinhToHop(1);
		System.out.println(String.format("Tong cong co %d to hop", dem));
		scanner.close();
	}
}
