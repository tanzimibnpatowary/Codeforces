package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 30, 2020 11:06:37 AM
 */
public class P451A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int n = mScanner.nextInt();
		int m = mScanner.nextInt();
		int smallest = n;
		if (m < n) {
			smallest = m;
		}
		if (smallest % 2 != 0) {
			System.out.println("Akshat");
		} else {
			System.out.println("Malvika");
		}
	}

}
