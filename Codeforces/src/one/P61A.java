package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 29, 2020 12:57:57 PM
 */
public class P61A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String x = mScanner.next();
		String y = mScanner.next();
		char[] first = x.toCharArray();
		char[] second = y.toCharArray();
		for (int i = 0; i < second.length; i++) {
			if (first[i]==second[i]) {
				System.out.print(0);
			}else {
				System.out.print(1);
			}
		}
	}

}
