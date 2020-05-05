package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 4, 2020 11:46:09 AM
 */
public class P599A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int shop1= mScanner.nextInt();
		int shop2 = mScanner.nextInt();
		int total = mScanner.nextInt();
		int dist = shop1 + shop2 + total;
	    dist = Math.min(dist, 2 * shop1 + 2 * shop2);
	    dist = Math.min(dist, 2 * shop1 + 2 * total);
	    dist = Math.min(dist, 2 * shop2 + 2 * total);
	    System.out.println(dist);
	}

}
