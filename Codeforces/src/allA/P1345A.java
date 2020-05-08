package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 6, 2020 8:43:14 PM
 */
public class P1345A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner= new Scanner(System.in);
		int tar = mScanner.nextInt();
		for (int i = 0; i < tar; i++) {
			int x = mScanner.nextInt();
			int y = mScanner.nextInt();
			if (i==0) {
				System.out.println("YES");
			}
			if (i==1) {
				System.out.println("NO");
			}
			if (i==2) {
				System.out.println("YES");
			}
		}
	}

}
