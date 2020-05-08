package allA;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 7, 2020 2:24:38 PM
 */
public class P1095A {
	public static String solve(String string) {
		StringBuilder mBuilder = new StringBuilder();
		int index = 0;
		int target = 1;
		while (index<string.length()) {
			mBuilder.append(string.charAt(index));
			index = index + target;
			target++;
		}
		return mBuilder.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int n = mScanner.nextInt();
		String string = mScanner.next();
		System.out.println(solve(string));
	}

}
