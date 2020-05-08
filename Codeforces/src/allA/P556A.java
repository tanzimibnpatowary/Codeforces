package allA;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 7, 2020 5:21:13 PM
 */
public class P556A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int len = mScanner.nextInt();
		String mString = mScanner.next();
		char[] ch = mString.toCharArray();
		int zero = 0;
		int one = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='0') {
				zero++;
			}else if (ch[i]=='1') {
				one++;
			}
		}
		System.out.println(Math.abs(zero-one));
	}

}
