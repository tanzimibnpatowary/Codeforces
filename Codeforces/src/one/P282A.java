package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 10:46:00 AM
 */
public class P282A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target = mScanner.nextInt();
		int count = 0;
		for (int i = 0; i < target; i++) {
			int X = 1;
			String mString = mScanner.next();
			char array[] = mString.toCharArray();
			if (array[0]=='X') {
				if (array[1]=='+') {
					count = mString.length()-1;
				}else {
					count = mString.length()-1;
				}
			}else {
				if (array[1]=='+') {
					count = mString.length()-1;
				}else {
					count = mString.length()-1;
				}
			}
		}
		System.out.println(count);
	}

}
