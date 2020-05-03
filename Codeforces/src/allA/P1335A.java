package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 1, 2020 11:15:31 AM
 */
public class P1335A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int tar = mScanner.nextInt();
		for (int i = 0; i < tar; i++) {
			int x = mScanner.nextInt();
			System.out.println((x-1)/2);
		}
	}

}
