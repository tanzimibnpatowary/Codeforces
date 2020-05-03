package allA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 29, 2020 5:52:26 PM
 */
public class P443A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String mString = mScanner.nextLine();
		mString = mString.replaceAll("[\\s,{}]","");
		char[] c = mString.toCharArray();
		int toReplace=1;
		int coun = 0;
		Arrays.sort(c);
        HashSet<Character> mSet = new HashSet<Character>();
        for (Character x : c) {
			mSet.add(x);
		}
        System.out.println(mSet.size());
//        for (int i = 0; i < c.length; i++) {
//        	System.out.println(c[i]);
//		}
		
	}

}
