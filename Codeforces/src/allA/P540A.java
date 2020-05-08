package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 5:24:41 PM
 */
public class P540A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int digits = mScanner.nextInt();
		String given = mScanner.next();
		String original = mScanner.next();
		char[] givarr = given.toCharArray();
		char[] oriarr = original.toCharArray();
		int count = 0;
		for (int i = 0; i < oriarr.length; i++) {
			int giv = givarr[i];
			int ori = oriarr[i];
			 if (Math.abs(giv-ori)>5) {
				 count+=Math.abs(10-Math.abs(giv-ori));
			}else{
				count+=Math.abs((giv-ori));
			}
		}
		System.out.println(count);
	}

}
