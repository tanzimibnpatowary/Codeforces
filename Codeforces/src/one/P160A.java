package one;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 9:34:37 PM
 */
public class P160A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int how = mScanner.nextInt();
		int[] coin = new int[how];
		int sum = 0;
		for (int i = 0; i < how; i++) {
			coin[i] = mScanner.nextInt();
			sum = sum + coin[i];
		}
		Arrays.sort(coin);
		int mytarget = (sum/2);
		int result = 0;
		int k = 0;
		int count = 0;
		while (mytarget>=result) {
			count++;
			result += coin[how - count];
		}
		System.out.println(count);
	}

}
