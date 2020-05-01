package one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 30, 2020 12:10:42 PM
 */
public class P141A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String x = mScanner.nextLine();
		String y = mScanner.nextLine();
		String z = mScanner.nextLine();
		char[] xx = x.toCharArray();
		char[] yy = y.toCharArray();
		char[] zz = z.toCharArray();
		Arrays.sort(xx);
		Arrays.sort(yy);
		Arrays.sort(zz);
		HashSet<Character> mSet = new HashSet<Character>();
		for (Character c : zz) {
			mSet.add(c);
		}
		for (Character c : yy) {
			if (mSet.contains(c)) {
				mSet.remove(c);
			}else {
				mSet.add(c);
			}
		}
		System.out.println(mSet);
	}

}
