package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 1:32:01 PM
 */
public class P707A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int a = mScanner.nextInt();
		int b = mScanner.nextInt();
		boolean color = false;
		for (int row = 0; row < a; row++) {
			if (color) {
				break;
			}
			for (int col = 0; col < b; col++) {
				char x = mScanner.next().charAt(0);
				if (x == 'C' || x == 'M' || x == 'Y') {
					color = true;
					break;
				}
			}
		}
		System.out.println((color ? "#Color" : "#Black&White"));
	}

}
