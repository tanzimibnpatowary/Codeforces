package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 30, 2020 1:33:10 PM
 */
public class P1328A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target = mScanner.nextInt();
			while (target!=0) {
				int a = mScanner.nextInt();
				int b = mScanner.nextInt();
				int ans =  a % b == 0 ? 0 :  b - (a % b);
				System.out.println(ans);
				target--;
			}
		}

}
