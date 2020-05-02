package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 2, 2020 5:55:59 PM
 */
public class P432A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int number = mScanner.nextInt();
		int age = mScanner.nextInt();
		int allowage = 5-age;
		int count = 0;
		int team = 0;
		for (int i = 0; i < number; i++) {
			int x = mScanner.nextInt();
			if (allowage>=x) {
				count++;
			}
			if (count==3) {
				team++;
				count = 0;
			}
		}
		System.out.println(team);
	}

}
