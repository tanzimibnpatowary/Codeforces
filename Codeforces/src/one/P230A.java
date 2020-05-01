package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 30, 2020 8:40:48 PM
 */
public class P230A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int inibre = mScanner.nextInt();
		int target = mScanner.nextInt();
		for (int i = 0; i < target; i++) {
			int x = mScanner.nextInt();
			int y = mScanner.nextInt();
			if (inibre>x) {
				inibre = inibre + y;
				if (i==target-1) {
					System.out.println("YES");
				}
			}else {
				i=target;
				System.out.println("NO");
			}
		}
		
	}

}
