package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 2, 2020 5:28:59 PM
 */
public class P1343A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int tar = mScanner.nextInt();
		for (int i = 0; i < tar; i++) {
			int x = mScanner.nextInt();
			int result = 0;
			for (int k = 2; k <= 35; ++k) {
				int go = (int) Math.pow(2, k)-1;
				if (x%go==0)
					continue;
					result = x/go;
					break;
			}
			System.out.println(result);
			
		}
	}

}
