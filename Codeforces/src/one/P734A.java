package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 1:48:41 PM
 */
public class P734A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target = mScanner.nextInt();
		String cheString = mScanner.next();
		char[] my = cheString.toCharArray();
		int countD = 0;
		int countA = 0;
		for (int i = 0; i < my.length; i++) {
			if (my[i]=='D') {
				countD++;
			}else {
				countA++;
			}
		}
		if (countA==countD) {
			System.out.println("Friendship");
		}else if (countD>countA) {
			System.out.println("Danik");
		}else {
			System.out.println("Anton");
		}
	}

}
