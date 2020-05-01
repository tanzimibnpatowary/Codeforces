package one;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 30, 2020 10:37:45 PM
 */
public class P189A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int total = mScanner.nextInt();
		int[] pices = new int[3];
		for (int i = 0; i < 3; i++) {
			pices[i]  = mScanner.nextInt();
		}
		Arrays.sort(pices);
//		for (int i = 0; i < pices.length; i++) {
//			pices[i] = Math.min);
//		 }

		if (pices[0]>=total) {
			System.out.println(1);
		}else if (pices[0]+pices[1]>=total) {
			System.out.println(2);
		}else if (pices[0]+pices[1]+pices[2]>=5) {
			System.out.println(3);
		}
	}

}
