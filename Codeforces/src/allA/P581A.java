package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 1, 2020 12:36:24 PM
 */
public class P581A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int a = mScanner.nextInt();
		int b = mScanner.nextInt();
		int diff = (a < b) ? a : b;
	    int after = (a + b - 2 * diff) / 2;
	    System.out.println(diff+" "+after);
	}

}
