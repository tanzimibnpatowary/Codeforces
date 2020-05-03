package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 30, 2020 10:15:51 PM
 */
public class P472A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		long target = mScanner.nextLong();
		if (target % 2 != 0) {
			System.out.println(9+" "+(target - 9));
		} else {
			System.out.println(4+" "+(target - 4));
		}

	}

}
