package one;

import java.math.BigInteger;
import java.util.Scanner;

public class P105 {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		BigInteger mBigInteger = new BigInteger("0");
		int target = mScanner.nextBigInteger().intValueExact();
		int count = mBigInteger.intValueExact();
		for (int i = 1; i <=target; i++) {
			for (int j = 1; j <= i; j++) {
					if (j%3==0) {
						count++;
					}
			}
		}
		System.out.println(count);
	}
}
