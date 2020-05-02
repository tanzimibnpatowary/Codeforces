package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 1, 2020 8:40:27 PM
 */
public class P1348A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target = mScanner.nextInt();
		int result = 0;
		int result1 = 0;

		for (int i = 0; i < target; i++) {
			int how = mScanner.nextInt();
			int high = how/2;
			int min = 0;
			int k = 1;
			for (int j = how; j >=1; j--) {
				if (j>k) {
					min = (int) (Math.pow(2, j)+Math.pow(2, k));
					System.out.println(min);
					result = result - min;
				}
			}
			k++;
		}
		System.out.println(Math.abs(result));
	}

}
