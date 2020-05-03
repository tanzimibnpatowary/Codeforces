package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 1, 2020 4:42:59 PM
 */
public class P82A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int n = mScanner.nextInt();
		int power = 0;
		String name[] = { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };
		n--;
	    while (n >= 5) {
	        n = n - 5;
	        n = n / 2;
	    }
		System.out.println(name[n]);
	}

}
