package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 1, 2020 8:13:55 PM
 */
public class P427A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target = mScanner.nextInt();
		int crime = 0;
		int police = 0;
		for (int i = 0; i < target; i++) {
			int x = mScanner.nextInt();
			if (x<0) {
				crime++;
				if (police>0) {
					crime--;
					police--;
				}
			}else {
				if (x>1) {
					police = police + x;
				}else {
					police++;
				}
			}
		}
		System.out.println(crime);
	}

}
