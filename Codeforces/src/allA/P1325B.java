package allA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 9:09:48 PM
 */
public class P1325B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target = mScanner.nextInt();
		for (int i = 0; i < target; i++) {
			int howlong = mScanner.nextInt();
			int[] arr = new int[howlong];
			for (int j = 0; j < howlong; j++) {
				arr[j] = mScanner.nextInt();
			}
			Arrays.sort(arr);
			HashSet<Integer> mSet = new HashSet<Integer>();
			for (Integer x : arr) {
				mSet.add(x);
			}
			System.out.println(mSet.size());
 		}
	}
//3 1 4 1 5 9 3 1 4 1 5 9 3 1 4 1 5 9
//3 1 4 1 5 9 3 1 4 1 5 9 3 1 4 1 5 9	
}
