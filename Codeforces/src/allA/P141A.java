package allA;

import java.util.Arrays;
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
		String sum = x+y+z;
		char[] all = sum.toCharArray();
		Arrays.sort(all);
		int[] Count = new int[256];
		for (int i = 0; i < all.length; i++) {
			int sambol = all[i];
			Count[sambol]=Count[sambol]+1;
		}
		for (int i = 0; i < Count.length; i++) {
			if (Count[i]%2==0) {
				Count[i] = 0;
			}
		}
		String add = "";
		for (int i = 0; i < Count.length; i++) {
			add+=Count[i];
		}
		add= add.replaceAll("0", "");
		if (add.length()>0) {
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
	}
}
