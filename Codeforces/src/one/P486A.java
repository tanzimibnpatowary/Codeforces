package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 8:57:06 PM
 */
public class P486A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		long n = mScanner.nextLong();
		if (n%2==0) {
			System.out.println(n/2);
		}else {
			long temp = (n/2)+1;
			long g = temp*2;
			System.out.println(temp-g);
		}
		
	}

}
