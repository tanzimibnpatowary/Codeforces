package allA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 1:19:52 PM
 */
public class P271A {
	public static int isBeautiful(int year) {
		int a = year % 10;
		int b = (year / 10) % 10;
		if (b == a) {
			return 0;
		}
		int c = (year / 100) % 10;
		if (c == a || c == b) {
			return 0;
		}
		int d = (year / 1000) % 10;
		if (d == a || d == b || d == c) {
			return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int number = mScanner.nextInt();
		while (isBeautiful(++number) == 0)
			;
		System.out.println(number);
	}
}
