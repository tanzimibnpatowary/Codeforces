package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 29, 2020 8:36:34 AM
 */
public class P231A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target = mScanner.nextInt();
		int count = 0;
		for (int i = 0; i < target; i++) {
			int x = mScanner.nextInt();
			int y = mScanner.nextInt();
			int z = mScanner.nextInt();
			if (x == 1 && y == 1 || y == 1 && z == 1 || x == 1 && z == 1 || x == 1 && y == 1 && z == 1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
