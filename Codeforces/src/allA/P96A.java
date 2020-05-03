package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 12:41:36 PM
 */
public class P96A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String mString = mScanner.nextLine();
		int one = 0;
		int zero = 0;
		int maxone = 0;
		int maxzero = 0;
		for (int i = 0; i < mString.length(); i++) {
			int x = mString.charAt(i);
			if (x=='0') {
				zero++;
			}else if(x=='1'){
				one++;
			}
			if (maxone<one) {
				maxone = one;
			}
			if (maxzero<zero) {
				maxzero = zero;
			}
			if (x=='0') {
				one = 0;
			}else {
				zero = 0;
			}
		}
		
		if (maxone>=7||maxzero>=7) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
