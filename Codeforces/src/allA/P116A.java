package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 9:11:43 PM
 */
public class P116A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int passenger = 0;
		int highest  = 0;
		int target = mScanner.nextInt();
		for (int i = 0; i < target; i++) {
			int a1=  mScanner.nextInt();
			int b1 = mScanner.nextInt();
			if (i==0) {
				passenger = passenger+b1;
			}else {
				passenger = passenger -a1;
				passenger = passenger + b1;
			}
			if (highest<passenger) {
				highest = passenger;
			}
		}
		System.out.println(highest);
	}

}
