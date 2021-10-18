import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static long getCount(int n, long sum ,long[] arr) {
		HashMap<Long, Long> hashMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (!hashMap.containsKey(arr[i]))
				hashMap.put(arr[i], Long.valueOf(0));
			hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
		}
		long count = 0;
		for (int i = 0; i < n; i++) {
			if (hashMap.get(sum - arr[i]) != null)
				count += hashMap.get(sum - arr[i]);
			if (sum - arr[i] == arr[i])
				count--;
		}
		return count / 2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			long k = scanner.nextLong();
			long[] arr = new long[n]; 
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextLong();
			}
			System.out.println(getCount(n, k, arr));
		}
		scanner.close();
	}
}