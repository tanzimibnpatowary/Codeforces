package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 10:01:57 PM
 */
public class P791A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int limak = mScanner.nextInt();
		int bob = mScanner.nextInt();
		int count = 0;
		while (limak<=bob) {
			limak = limak * 3;
			bob = bob *2;
			count++;
		}
		System.out.println(count);
	}

}
