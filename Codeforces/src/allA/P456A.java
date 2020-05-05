package allA;

import java.util.Iterator;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 4, 2020 12:43:12 AM
 */
public class P456A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int t = mScanner.nextInt();
		int alex = 0;
		int pooralex = 0;
		for (int i = 0; i < t; i++) {
			
			int x = mScanner.nextInt();
			int y = mScanner.nextInt();
			if (x!=y) {
				alex = 1;
			}
		}
		if (alex==1) {
			System.out.println("Happy Alex");
		}else {
			System.out.println("Poor Alex");
		}
		
	}

}
