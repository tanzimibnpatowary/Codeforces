package allA;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 2:25:26 PM
 */
public class P431A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int[] four = new int[4];
		for (int i = 0; i < four.length; i++) {
			four[i] = mScanner.nextInt();
		}
		//1 5 3 2
		//11221
		String mString = mScanner.next();
		char[] myArray = mString.toCharArray();
		ArrayList<Character> mArrayList = new ArrayList<Character>();
		for (char i : myArray) {
			mArrayList.add(i);
		}
		// 48 57 2
		int sum = 0;
		for (int i = 0; i < mString.length(); i++) {
			int b = Math.abs(48-mArrayList.get(i));
			sum = sum + four[b-1];
		}
		System.out.println(sum);
	}

}
