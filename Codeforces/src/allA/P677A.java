package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 29, 2020 11:53:23 AM
 */
public class P677A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int frieds = mScanner.nextInt();
		int max = mScanner.nextInt();
		int sum = 0;
		for (int i = 0; i < frieds; i++) {
			int height = mScanner.nextInt();
			if (height>max) {
				sum = sum + 2;
			}else {
				sum = sum + 1;
			}
			
		}
		System.out.println(sum);
	}

}
