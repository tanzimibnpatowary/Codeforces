package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 1:14:06 PM
 */
public class P281A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String word = mScanner.nextLine();
		String cap = word.toUpperCase();
		char[] capA = cap.toCharArray();
		System.out.print(capA[0]);
		for (int i = 1; i < word.length(); i++) {
			char c = word.charAt(i);
			System.out.print(c);
		}
	}

}
