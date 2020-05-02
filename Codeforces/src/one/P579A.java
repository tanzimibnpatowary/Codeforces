package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 2, 2020 8:52:42 PM
 */
public class P579A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nScanner = new Scanner(System.in);
		int days = nScanner.nextInt();
		int count = 0;
		while (days>0) {
			count = count+days%2;
			days/=2;
		}
		System.out.println(count);
	}

}
