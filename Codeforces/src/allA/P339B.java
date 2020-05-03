package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 11:46:29 AM
 */
public class P339B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		long n = mScanner.nextLong();
		long m = mScanner.nextLong();
		long current = 0;
		long total = 0;
		long last = 1;
		for (int i = 0; i < m; i++) {
			current = mScanner.nextLong();
			total+=current-last;
			System.out.println(total);
			if (current<last) {
				total+=n;
			}
			last = current;
		}
		System.out.println(total);
	}

}
