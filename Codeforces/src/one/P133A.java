package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 11:02:30 PM
 */
public class P133A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String xString = mScanner.nextLine();
		int check = 0;
		char[] myArray = xString.toCharArray();
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i]=='H'||myArray[i]=='Q'||
					myArray[i]=='9' ) {
					check = 1;
				}
		}
		if (check==1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
				
	}

}
