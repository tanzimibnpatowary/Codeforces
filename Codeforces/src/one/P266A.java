package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 29, 2020 11:29:52 AM
 */
public class P266A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int color = mScanner.nextInt();
		String xString = mScanner.next();
		char[] hc = xString.toCharArray();
		int j = 1;
		int cout = 0;
		for (int i = 0; i < hc.length-1; i++) {
			if (hc[j]==hc[i]) {
				cout++;
			}
			j++;
		}
		System.out.println(cout);
	}

}
