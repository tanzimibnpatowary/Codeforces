package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 12:22:40 AM
 */
public class P155A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int tar = mScanner.nextInt();
		int scorenew = mScanner.nextInt();
		int big = scorenew;
		int small = scorenew;
		int amazi = 0;
		for (int i = 1; i < tar; i++) {
			scorenew = mScanner.nextInt();
			if (big>scorenew) {
				big = scorenew;
				amazi++;
			}else if(small<scorenew) {
				small= scorenew;
				amazi++;
			}
		}
		System.out.println(amazi);
	}

}
