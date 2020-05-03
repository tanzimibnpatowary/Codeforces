package allA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 2, 2020 7:40:50 PM
 */
public class P1097A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String card = mScanner.next();
		String allcard = "";
		for (int i = 0; i < 5; i++) {
			allcard = allcard + mScanner.next();
		}
		char[] arr = allcard.toCharArray();
		Arrays.sort(arr);
		char x = card.charAt(0);
		char y = card.charAt(1);
		int a = 0;
		for (char c : arr) {
			if (c==x||c==y) {
				a = 1;
			}
		}
		if (a==1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
