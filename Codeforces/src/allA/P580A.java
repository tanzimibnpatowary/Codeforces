package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 12:06:15 PM
 */
public class P580A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int n = mScanner.nextInt();
		int count = 0;
		int first = 0;
		int[] seq = new int[n];
		for (int i = 0; i < n; i++) {
			seq[i] = mScanner.nextInt();
		}
		int currentMax = 1;
		int ans = 1;
		for (int p = 1; p < n; p++) {
			if (seq[p] >= seq[p - 1]) {
				++currentMax;
			} else {
				currentMax = 1;
			}
			if (currentMax > ans) {
				ans = currentMax;
			}
		}
		System.out.println(ans);
	}

}
