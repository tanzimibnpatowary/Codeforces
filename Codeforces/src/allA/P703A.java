package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 2, 2020 5:06:08 PM
 */
public class P703A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int t  = mScanner.nextInt();
		int mo = 0;
		int ch = 0;
		for (int i = 0; i < t; i++) {
			int m = mScanner.nextInt();
			int c = mScanner.nextInt();
			if (m>c) {
				mo++;
			}else if(m<c) {
				ch++;
			}
		}
		if (mo>ch) {
			System.out.println("Mishka");
		}else if(mo==ch) {
			System.out.println("Friendship is magic!^^");
		}else {
			System.out.println("Chris");
		}
	}

}
