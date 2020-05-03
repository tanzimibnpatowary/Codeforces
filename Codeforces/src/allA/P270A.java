package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 2, 2020 9:18:48 PM
 */
public class P270A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int angle = mScanner.nextInt();
		while (angle!=0) {
			int x = mScanner.nextInt();
			if (360%(180-x)==0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			angle--;
		}
	}

}
