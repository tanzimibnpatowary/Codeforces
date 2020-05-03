package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 9:15:27 AM
 */
public class P71A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target = mScanner.nextInt();
		for (int i = 0; i < target; i++) {
			String text = mScanner.next();
			char[] array = text.toCharArray();
			if (array.length<=10) {
				System.out.println(text);
			}else {
				System.out.print(array[0]);
				System.out.print(array.length-2);
				System.out.println(array[array.length-1]);
			}
		}
	}

}
