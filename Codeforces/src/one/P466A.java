package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 2, 2020 11:40:47 AM
 */
public class P466A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int n  = mScanner.nextInt();
		int m  = mScanner.nextInt();
		int a  = mScanner.nextInt();
		int b  = mScanner.nextInt();
		int bundles = n / m; 
	    int singles = n % m;

	    long total = 0;
	    total += bundles * ((m * a < b) ? m * a : b);
	    total += (singles * a < b) ? singles * a : b;
	    System.out.println(total);
	}

}
