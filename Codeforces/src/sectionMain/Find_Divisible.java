package sectionMain;

import java.util.Scanner;

public class Find_Divisible {
	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		int number = mScanner.nextInt();
		int first = 0,second = 0;
		for (int i = number-1; i >= 0; i--) {
				first = mScanner.nextInt();
				second = mScanner.nextInt();
			if (first!=second) {
				System.out.println(first+" "+first*2);
			}
		}
	}
}
