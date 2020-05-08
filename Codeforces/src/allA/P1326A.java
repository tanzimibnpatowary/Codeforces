package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 6, 2020 4:49:30 PM
 */
public class P1326A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int tar = mScanner.nextInt();
		int arr[] = new int[tar];
		for (int i = 0; i < tar; i++) {
			arr[i] = mScanner.nextInt();
		}
		int x = 0;
		for (int i = 0; i <tar; i++) {
			int ai = arr[i]+x;
			System.out.print(ai+" ");
			x= Math.max(x, ai);
		}
	}

}
