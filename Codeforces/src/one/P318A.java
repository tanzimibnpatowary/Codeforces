package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 8:09:28 PM
 */
public class P318A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		long n = mScanner.nextLong();
		long k = mScanner.nextLong();
		System.out.println(((k <= (n+1)/2) ? (2*k - 1) : (2 * (k - (n + 1)/2) ) ));
	}
}
