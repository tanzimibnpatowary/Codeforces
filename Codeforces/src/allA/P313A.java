package allA;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 2, 2020 4:14:29 PM
 */
public class P313A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);	
		int n = mScanner.nextInt();
		if (n>0) {
			System.out.println(n);
		}else {
			ArrayList<Character> mList = new ArrayList<Character>();
			String xString = Integer.toString(n);
			char[] myA = xString.toCharArray();
			for (char c : myA) {
				mList.add(c);
			}
			mList.remove(mList.size()-1);
			for (int i = 0; i < mList.size(); i++) {
				System.out.print(mList.get(i));
			}
		}
		
		
		
	}

}
