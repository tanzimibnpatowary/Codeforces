package allA;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 5, 2020 9:28:26 AM
 */
public class P1327A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int test = mScanner.nextInt();
		
		for (int i = 0; i < test; i++) {
			int n = mScanner.nextInt();
			int k = mScanner.nextInt();
			if (n%2==k%2&&(long)k*k<=n) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
