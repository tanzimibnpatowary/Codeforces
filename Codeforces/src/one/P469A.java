package one;

import java.util.HashSet;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 29, 2020 4:56:27 PM
 */
public class P469A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int level = mScanner.nextInt();
		HashSet<Integer> mSet = new HashSet<Integer>();
		int p = mScanner.nextInt();
		for (int i = 0; i <p; i++) {
			mSet.add(mScanner.nextInt()); 
		}
		int q = mScanner.nextInt();
		for (int i = 0; i < q; i++) {
			int x = mScanner.nextInt();
			if (!mSet.contains(x)) {
				mSet.add(x);
			}
		}
		if (mSet.size()==level) {
			System.out.println("I become the guy.");
		}else {
			System.out.println("Oh, my keyboard!");
		}
	}

}
