package one;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 24, 2020 8:46:16 PM
 */
public class P393A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String mString = mScanner.nextLine();
		ArrayList<Character> mSet = new ArrayList<Character>();
		char[] mytext = mString.toCharArray();
		for (char i : mytext) {
			mSet.add(i);
		}
		System.out.println(mSet);
		int target = 0;
		char[] nine = {'n','i','n','e','t','e','e','n'};
		ArrayList<Character> nineth = new ArrayList<Character>();
		for (int i = 0; i < nine.length; i++) {
			nineth.add(nine[i]);
		}
		int nthtarget = 0;
		for (int i = 0; i < mytext.length;i++) {
			if (nthtarget==8) {
				nthtarget=0;
			}
			//ineteenineteen
			if (mSet.get(i)==nineth.get(nthtarget)) {
				//System.out.println(nine[nthtarget]);
				mSet.remove(i);
				System.out.println(i);
				target++;
				nthtarget++;
				
			}
			
		}
		//System.out.println(mSet);
		//System.out.println(target);
	}

}
