import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger x = input.nextBigInteger();
        BigInteger y = input.nextBigInteger();
        x = x.subtract(y);
        System.out.print(x);
        input.close();
    }
  }
