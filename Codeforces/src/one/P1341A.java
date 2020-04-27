package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 24, 2020 8:10:03 PM
 */
public class P1341A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target  = mScanner.nextInt();
		for (int i = 0; i < target; i++) {
			int x = mScanner.nextInt();
			int a = mScanner.nextInt();
			int b = mScanner.nextInt();
			int c = mScanner.nextInt();
			int d = mScanner.nextInt();
			
			int totalx = (a+b)*x;
			int totaly = (a-b)*x;
			int totala = c+d;
			int totalb = c-d;
			if (totalx==totala || totalx==totalb || totaly==totalb || totaly==totala) {
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}
