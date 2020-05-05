package allA;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 5, 2020 10:22:35 PM
 */
//uxxxxxlmexxxxxxxwnxxexxxxxcxxfydxxxxxxvmdxxxxxxisxxxxxxxxidkxxxpxxxxxxxxmnuxxxxjxxxqcxxwmxxxxxxxxmrx
public class P978B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int n  = mScanner.nextInt();
		String mString = mScanner.next();
		int count = 0;
		ArrayList<Character> mList = new ArrayList<Character>();
		for (int i = 0; i < mString.length(); i++) {
			char x = mString.charAt(i);
			if (x=='x') {
				mList.add(x);
				if (i==mString.length()-1) {
					if (mList.size()>=3) {
						count =count+ mList.size()-2;
					}
					mList.clear();
				}
			}else {
				if (mList.size()>=3) {
					count =count+ mList.size()-2;
				}
				mList.clear();
			}
		}
		System.out.println(count);
	}

}
