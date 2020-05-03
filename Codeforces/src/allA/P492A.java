package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 2, 2020 9:30:19 PM
 */
public class P492A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int n = mScanner.nextInt();
		long a = 0;
		while (a * (a + 1) * (a + 2) <= 6 * n) {
			++a;
		}
		System.out.println(--a);
		
	}

}
