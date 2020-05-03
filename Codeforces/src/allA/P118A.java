package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 10:09:39 AM
 */
public class P118A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String mString = mScanner.nextLine();
		mString = mString.toLowerCase();
		StringBuilder mBuilder = new StringBuilder();
		for (int i = 0; i < mString.length(); i++) {
			char x = mString.charAt(i);
			if (x=='A'||x=='O'||x=='Y'||x=='E'||x=='U'||x=='I'
				||x=='a'||x=='o'||x=='y'||x=='e'||x=='u'||x=='i'	) {
			}else {
				mBuilder.append('.');
				mBuilder.append(x);
			}
		}
		System.out.println(mBuilder);
	}

}
