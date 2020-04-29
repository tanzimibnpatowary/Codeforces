package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 10:46:00 AM
 */
public class P282A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target = mScanner.nextInt();
		int output = 0;
		while (target > 0) {
			String mString = mScanner.next();
			char[] hello = mString.toCharArray();
			if (hello[1] == '+') {
				++output;
			} else {
				--output;
			}
			target--;
		}
		System.out.println(output);
	}

}
