package one;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 2:07:00 PM
 */
public class P236A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String X = mScanner.nextLine();
		int count = 0;
		
		char[] seq = X.toCharArray();
		Arrays.sort(seq);
		int j = 1;
		for (int i = 0; i < X.length()-1; i++) {
			if (seq[i]==seq[j]) {
				count++;
			}
			j++;
		}
		int len = X.length()-count;
		if (len%2==0) {
			System.out.println("CHAT WITH HER!");
		}else {
			System.out.println("IGNORE HIM!");
		}
	}

}
