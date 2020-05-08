package allA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 8, 2020 4:09:21 PM
 */
public class P1294A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int tar = mScanner.nextInt();
		for (int i = 0; i < tar; i++) {
			int arr[] = new int[3];
			arr[0] = mScanner.nextInt();
			arr[1] = mScanner.nextInt();
			arr[2] = mScanner.nextInt();
			int hav = mScanner.nextInt();
			Arrays.sort(arr);
			int first = Math.abs(arr[2]-arr[1]);
			int second = Math.abs(arr[2]-arr[0]);
			int last = (hav-(first+second));
			if (last>=3) {
				if (last%3==0) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}else {
				if (last==0) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
			
		}
	}

}
