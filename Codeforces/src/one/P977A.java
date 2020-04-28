package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 10:31:10 PM
 */
public class P977A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int number  = mScanner.nextInt();
		int how = mScanner.nextInt();
		while (how>0) {
			if (number%10==0) {
				number/=10;
			}else {
				number--;
			}
			how--;
		}
		System.out.println(number);
	}

}
