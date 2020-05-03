package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 2:31:31 PM
 */
public class P705A {
///I hate that I love that I hate it

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int t = mScanner.nextInt();
		String result = "";
		for (int i = 1; i <= t; i++) {
			if (t==i) {
				if (i%2==0) {
					result = result+"I love it";
				}else {
					result = result+"I hate it";
				}
			}
			else if(t==1) {
				result = "I hate it";
			}else {
				if (i%2==0) {
					result = result + "I love that ";
				}else {
					result = result + "I hate that ";
				}
			}
			
			
		}
		System.out.println(result);
	}

}
