package one;

import java.util.Scanner;

public class P123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int first = 1, febo;
		int second = 1, sum = 0;
		int target = mScanner.nextInt();
		while (target!=0) {
			sum = sum+first;
			febo = first+ second;
			first = second;
			second = febo;
			target--;
		}
		System.out.println(sum);
	}

}
