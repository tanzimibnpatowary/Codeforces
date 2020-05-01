package one;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 30, 2020 11:22:35 AM
 */
public class P520A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target = mScanner.nextInt();
		int countx = 0;
		String mString = mScanner.next();
		mString = mString.toLowerCase();
		char[] x = mString.toCharArray();
		Arrays.sort(x);
		HashSet<Character> mSet = new HashSet<Character>();
		for (char c : x) {
			mSet.add(c);
		}

		if (mSet.size()==26) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
