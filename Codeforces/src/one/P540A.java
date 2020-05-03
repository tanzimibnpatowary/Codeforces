package one;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 5:24:41 PM
 */
public class P540A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int move = mScanner.nextInt();
		String given = mScanner.next();
		String original = mScanner.next();
		char[] oriArr = original.toCharArray();
		char[] givArr = given.toCharArray();
		ArrayList<Character> oriArrList = new ArrayList<Character>();
		ArrayList<Character> givArrList = new ArrayList<Character>();
		for (Character x : oriArr) {
			oriArrList.add(x);
		}
		for (Character x : givArr) {
			givArrList.add(x);
		}
		int howkey  =0;
		for (int i = 0; i < givArrList.size(); i++) {
			int givennumber = Math.abs(48-givArrList.get(i)-1);
			int originalnumber = Math.abs(48-oriArrList.get(i)-1);
			if (givennumber-originalnumber>0) {
				howkey+=givennumber-originalnumber;
			}else {
				howkey+=(givennumber+10)-givennumber;
				int session = (givennumber+10)-givennumber;
				if (givArrList.get(i+1)!=null) {
					givArrList.add(i+1, (char) (session+48));
				}
			}
		}
		System.out.println(howkey);
	}

}
