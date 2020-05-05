package allA;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 5, 2020 8:42:11 PM
 */
public class P1220A {
//one zero
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int len = mScanner.nextInt();
		String mString = mScanner.next();
		int count = 0;
		for (int i = 0; i < mString.length(); i++) {
			char x = mString.charAt(i);
			if (x=='z') {
				count++;
			}
		}
		int t = mString.length()-(count*4);
		int one = t/3;
		for (int i = 0; i < one; i++) {
			System.out.println(1);
		}
		for (int i = 0; i < count; i++) {
			System.out.println(0);
		}
	}

}
