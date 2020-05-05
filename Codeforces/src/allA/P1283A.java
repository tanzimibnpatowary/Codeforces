package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 4, 2020 1:03:02 PM
 */
public class P1283A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int t = mScanner.nextInt();
		for (int i = 0; i < t; i++) {
			int h = mScanner.nextInt();
			int m = mScanner.nextInt();
			if (h>0) {
				System.out.println((24*60)-((h*60)+m));
			}else {
				System.out.println((24*60)-m);
			}
		}
	}

}
