package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 12:19:08 PM
 */
public class P339A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String x = mScanner.nextLine();
		char[] result = x.toCharArray();
		for (int i = 0; i < x.length(); i=i+2) {
			for (int j = 0; j < x.length()-1; j=j+2) {
				if (result[i]<result[j]) {
					int temp = result[j];
					result[j] = result[i];
					result[i] = (char) temp;
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
	}

}
