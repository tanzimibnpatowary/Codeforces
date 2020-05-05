package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 4, 2020 12:17:49 AM
 */
public class P1296 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner  = new Scanner(System.in);
		int t = mScanner.nextInt();
		int sum = 0;
		for (int i = 0; i < t; i++) {
			int how = mScanner.nextInt();
			for (int j = 0; j < how; j++) {
				int x = mScanner.nextInt();
				if (x%2!=0) {
					sum+=x;
				}
				
			}
//			if (sum & 1 || (1 <= sum && sum < how)) {
//				System.out.println("NO");
//			}else {
//				System.out.println("YES");
//			}
			sum=0;
		}
		
	}

}
