package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 7, 2020 8:50:20 PM
 */
public class P1351A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int tar = mScanner.nextInt();
		for (int i = 0; i < tar; i++) {
			System.out.println(mScanner.nextInt()+mScanner.nextInt());
		}
	}

}
