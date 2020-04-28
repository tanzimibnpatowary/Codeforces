package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 11:48:33 AM
 */
public class P467A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int howmany = mScanner.nextInt();
		int count = 0;
		for (int i = 0; i < howmany; i++) {
			int nowliving = mScanner.nextInt();
			int totalliving = mScanner.nextInt();
			if (nowliving<=totalliving-2) {
				count++;
			}
		}
		System.out.println(count);
	}

}
