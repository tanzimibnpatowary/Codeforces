package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 8, 2020 11:21:29 AM
 */
public class P1186A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int n = mScanner.nextInt();
		int m = mScanner.nextInt();
		int k = mScanner.nextInt();
		if (m>=n&&k>=n) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
