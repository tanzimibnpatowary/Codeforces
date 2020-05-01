package one;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 29, 2020 5:29:08 PM
 */
public class P25A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int t = mScanner.nextInt();
		for (int i = 1; i <= t ; i++) {
			int x = mScanner.nextInt();
			if (x%2!=0) {
				System.out.println(i);
			}
		}
		
	}

}
