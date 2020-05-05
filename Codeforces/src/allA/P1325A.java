package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 9:32:18 PM
 */
public class P1325A {
//	public static int gcdOrlcd(int n1, int n2) {
//		int a = n1;
//		int b = n2;
//		while (n2!=0) {
//			int rem = n1%n2;
//			n1 = n2;
//			n2 = rem;
//		}
//		int gcd = n1;
//		int lcd = (a*b)/gcd;
//		return gcd+lcd;
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int t = mScanner.nextInt();
		
		for (int k = 0; k < t; k++) {
			int n = mScanner.nextInt();
			System.out.println(1+" "+(n-1));
//			for (int i = 1; i < n; i++) {
//				int get = gcdOrlcd(i, n-i);
//				if (get==n) {
//					System.out.println(i+" "+(n-i));
//					i=n;
//				}
//			}
		}
		
	}

}
