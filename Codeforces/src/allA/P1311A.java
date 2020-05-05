package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 11:55:11 PM
 */
public class P1311A {
	 static int solve(int a, int b) {
	        if (a == b) {
	            return 0;
	        } else if ((a < b && (b - a) % 2 != 0) || (a > b && (a - b) % 2 == 0)) {
	            return 1;
	        } else {
	            return 2;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int n = mScanner.nextInt();
		for (int i = 0; i < n; i++) {
			int a = mScanner.nextInt();
			int b = mScanner.nextInt();
			System.out.println(solve(a, b));
			}
		}
}
