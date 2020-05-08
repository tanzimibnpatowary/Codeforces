package allA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 6, 2020 4:08:35 PM
 */
public class P1003A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int tar = mScanner.nextInt();
		int[] arr = new int[tar];
		for (int i = 0; i < tar; i++) {
			arr[i] = mScanner.nextInt();
		}
		Arrays.sort(arr);
		int count[] = new int[1000];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]] = count[arr[i]]+1;
		}
		int max = 0;
		for (int i = 0; i < count.length; i++) {
			if (max<count[i]) {
				max = count[i];
			}
		}
		System.out.println(max);
	}

}
