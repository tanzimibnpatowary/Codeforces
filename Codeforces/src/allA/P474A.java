package allA;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 8:36:31 PM
 */
public class P474A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		char position = mScanner.next().charAt(0);
		String given = mScanner.next();
		char[] arrgiv = given.toCharArray();
		String all = "qwertyuiopasdfghjkl;zxcvbnm,./";
		String reform = "";
		ArrayList<Character> mList = new ArrayList<Character>();
		for (char ch : arrgiv) {
			mList.add(ch);
		}
		char[] allArr = all.toCharArray();
		if (position=='R') {
			for (int i = 0; i < mList.size(); i++) {
				for (int j = 0; j < allArr.length;j++) {
					if (allArr[j]==mList.get(i)) {
						reform = reform + allArr[j-1];
					}
				}
			}
		}else if (position=='L') {
			for (int i = 0; i < mList.size(); i++) {
				for (int j = 0; j < allArr.length-1;j++) {
					if (allArr[j]==mList.get(i)) {
						reform = reform + allArr[j+1];
					}
				}
			}
		}
		System.out.println(reform);
	}

}
