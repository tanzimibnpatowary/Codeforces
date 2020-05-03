package allA;

import java.util.Scanner;


/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 29, 2020 10:16:48 AM
 */
//3 3   1 4 
public class P263A {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		int[][] myList = new int[5][5];
		int x = 0;
		int y = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				myList[i][j] = mScanner.nextInt();
				if (myList[i][j]==1) {
					x = i;
					y = j;
				}
			}
		}
		System.out.println(Math.abs(x-2)+Math.abs(y-2));
	}
}
