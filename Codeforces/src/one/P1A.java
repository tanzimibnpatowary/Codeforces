package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 12:41:32 PM
 */
public class P1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		long m = mScanner.nextInt();
		long n = mScanner.nextInt();
		long a = mScanner.nextInt();
		System.out.println(((m+a-1)/a)*((n+a-1)/a));
	}

}
