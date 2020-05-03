package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 8:55:26 PM
 */
public class P546A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int banPrice = mScanner.nextInt();
		int ihave = mScanner.nextInt();
		int iwant = mScanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= iwant; i++) {
			sum = sum + i*banPrice;
		}
		if (sum-ihave<=0) {
			System.out.println(0);
		}else {
			System.out.println(sum-ihave);
		}
	}

}
