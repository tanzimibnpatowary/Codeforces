package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 4:37:49 PM
 */
public class P122A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int number = mScanner.nextInt();
		if(number % 4 == 0 || number % 7 == 0 
				|| number % 44 == 0 ||number % 47 == 0 
				|| number % 74 == 0 || number % 77 == 0 
				|| number % 444 == 0 || number % 447 == 0 
				|| number % 474 == 0 || number % 477 == 0 
				|| number % 744 == 0 || number % 747 == 0 
				||number % 774 == 0 || number % 777 == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
