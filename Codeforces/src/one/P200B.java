package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 29, 2020 4:21:01 PM
 */
public class P200B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		double sum = 0;
		int target = mScanner.nextInt();
		for (int i = 0; i < target; i++) {
			int x = mScanner.nextInt();
			sum = sum + x;
		}
		System.out.printf("%.12f\n",sum/target);
	}

}
