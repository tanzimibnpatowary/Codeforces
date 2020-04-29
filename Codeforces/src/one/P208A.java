package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 29, 2020 12:30:02 PM
 */
public class P208A {
//WUBWUBABCWUB
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String sung = mScanner.nextLine();
		String string = sung.replaceAll("WUB", " ");
		String after = string.trim().replaceAll(" +", " ");
		//String s = string.
		System.out.println(after);
	}

}
