package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 4, 2020 7:42:09 PM
 */
public class P731A {
	// 97 122
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String myString = mScanner.next();
		int prev = 'a';
		int count = 0;
		for (int i = 0; i < myString.length(); i++) {
			int c = myString.charAt(i);
			int dist = c - prev;
			if (dist < 0) {
				dist += 26;
			}
			if (dist > 26 / 2) {
				dist = 26 - dist;
			}
			count += dist;
			prev = c;
		}
		System.out.println(count);
	}

}
