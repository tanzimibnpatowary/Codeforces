package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 1, 2020 11:55:11 AM
 */
public class P510A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int n = mScanner.nextInt();
		int m = mScanner.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (i % 2 != 0) {
					System.out.print("#");
				} else {
					if ((i/2)%2!=0) {
						if (j == m) {
							System.out.print("#");
						}else {
							System.out.print(".");
						}
					} else if ( (i/2)%2==0) {
						if (j == 1) {
							System.out.print("#");
						}else {
							System.out.print(".");
						}
					} 
				}
			}
			System.out.println();
		}
	}

}
