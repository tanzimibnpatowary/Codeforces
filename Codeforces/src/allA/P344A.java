package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 7:49:07 PM
 */
public class P344A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int tar = mScanner.nextInt();
		int count = 0;
		int max = 0;
		int x1 = 0;
		int y1 = 0;
		for (int i = 0; i < tar; i++) {
			String mtString = mScanner.next();
			char [] go = mtString.toCharArray();
			String pluString = Character.toString(go[0]);
			String miuString = Character.toString(go[1]);
			int x = Integer.parseInt(pluString);
			int y = Integer.parseInt(miuString);
			if (x == 1 && y == 0) {
				x1++;
				y1 = 0;
				if (x1==1) {
					max++;
				}
			} else if (x == 0 && y == 1) {
				x1 = 0;
				y1++;
				if (y1==1) {
					max++;
				}
			}
		}
		System.out.println(max);
	}

}
