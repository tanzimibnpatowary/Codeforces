package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 9:44:49 PM
 */
public class P1255A {
	static int solve(int a, int b) {
		int result = 0;
		int diff = Math.abs(a - b);
		for (int unit : new int[] { 5, 2, 1 }) {
			result += diff / unit;
			diff %= unit;
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int[] volume = { -5, -2, -1, +1, +2, +5 };
		int tar = mScanner.nextInt();
		int min = 0;
		for (int i = 0; i < tar; i++) {
			int a = mScanner.nextInt();
			int b = mScanner.nextInt();

			System.out.println(solve(a, b));
		}
	}
//	else {
//		if (prV<=5) {
//			prV+=5;
//			min++;
//		}else if (prV<=2) {
//			prV+=2;
//			min++;
//		}else if (prV<=1) {
//			prV+=1;
//			min++;
//		}
//	}
}
