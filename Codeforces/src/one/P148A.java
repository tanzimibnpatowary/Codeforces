package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 29, 2020 4:46:42 PM
 */
public class P148A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int k= mScanner.nextInt();
		int l= mScanner.nextInt();
		int m= mScanner.nextInt();
		int n= mScanner.nextInt();
		int d = mScanner.nextInt();
		int count = 0;
		for (int i = 1; i <= d; i++) {
			if (i%k==0||i%l==0||i%m==0||
					i%n==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
