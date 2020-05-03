package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 10:42:14 AM
 */
public class P110A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		long number = mScanner.nextLong();
		int count = 0;
		while (number!=0) {
			long x = number%10;
			if (x==4||x==7) {
				count++;
			}
			number/=10;
		}
		if (count==7||count==4) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
// G B G G B
}
