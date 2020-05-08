package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 6, 2020 10:03:43 AM
 */
public class P1183A {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		int number = mScanner.nextInt();
		
		while (true) {
			int b = number, s = 0;
			while (b > 0) {
				s += b % 10;
				b /= 10;
			}
			if (s % 4 == 0) {
				break;
			} else {
				++number;
			}
		}
		System.out.println(number);
	}
}
