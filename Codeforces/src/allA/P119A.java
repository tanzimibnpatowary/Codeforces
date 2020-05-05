package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 4, 2020 10:03:06 AM
 */
public class P119A {
	public static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int a = mScanner.nextInt();
		int b = mScanner.nextInt();
		int n = mScanner.nextInt();
		while (true) {
			n -= gcd(a, n);
			if (n <= 0) {
				System.out.println(0);
				break;
			}
			n -= gcd(b, n);
			if (n <= 0) {
				System.out.println(1);
				break;
			}
		}

	}

}
