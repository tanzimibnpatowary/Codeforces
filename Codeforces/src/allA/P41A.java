package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 9:54:19 AM
 */
public class P41A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String x = mScanner.nextLine();
		String y = mScanner.nextLine();
		int count = 0;
		int len = x.length()-1;
		if (x.length()!=y.length()) {
			System.out.println("NO");
		}else {
			for (int i = 0; i < x.length(); i++) {
				if (x.charAt(i)!=y.charAt(len)) {
					count = 1;
				}
				len--;
			}
			if (count==1) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
		
		
	}

}
