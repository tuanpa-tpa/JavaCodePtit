import java.util.*;

public class Main {


	public static void main(String[] args) {
		int mx = 2000005;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        boolean[] isPrime = new boolean[mx];
        for (int i = 2; i * i < mx; ++i) {
            if (!isPrime[i]) {
                arrayList.add(i);
                for (int j = i * i; j < mx; j += i)
                    isPrime[j] = true;
            }
        }
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		long res = 0;
		for (int i = 0; i < t; i++) {
			int x = scanner.nextInt();
			int j = 0;
			while (x > 1) {
				if (!isPrime[x]) {
					res += x;
					break;
				}
				int tmp = arrayList.get(j); 
				while (x % tmp == 0) {
					res += tmp;
					x /= tmp;
				}
				j++;
			}
		}
		System.out.println(res);
		scanner.close();
	}
}

//import java.util.*;
//
//public class Main {
//
//	static final long MAXN = 2000005;
//	static long[] A = new long[(int) MAXN];
//
//	public static void slove() {
//		A[1] = (long)1;
//		for (long i = 2; i < MAXN; i++)
//			A[(int) i] = i;
//		for (long i = 4; i < MAXN; i += 2)
//			A[(int) i] = 2;
//		for (long i = 3; i * i < MAXN; i++) {
//			if (A[(int) i] == i) {
//				for (long j = i * i; j < MAXN; j += i)
//					if (A[(int) j] == j)
//						A[(int) j] = i;
//			}
//		}
//	}
//
//	public static long sum(long x) {
//		long res = 0;
//		while (x != 1) {
//			res += A[(int) x];
//			x = x / A[(int) x];
//		}
//		return res;
//	}
//
//	public static void main(String[] args) {
//		slove();
//		Scanner scanner = new Scanner(System.in);
//		int t = scanner.nextInt();
//		long res = 0;
//		for (int i = 0; i < t; i++) {
//			long n = scanner.nextLong();
//			res += sum(n);
//		}
//		System.out.println(res);
//		scanner.close();
//	}
//}