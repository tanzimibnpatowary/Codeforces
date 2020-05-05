package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 4, 2020 8:22:39 PM
 */
public class P151A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int n = mScanner.nextInt(), k = mScanner.nextInt(),
		l = mScanner.nextInt(), c = mScanner.nextInt(), 
		d = mScanner.nextInt(), p = mScanner.nextInt(), 
		nl = mScanner.nextInt(), np = mScanner.nextInt();
		int x1 = (k*l);
		int tost = (x1/nl);
		int enough = (c*d);
		int persalt = (p/np);
		System.out.println(Math.min((Math.min(x1/n, tost/n)), Math.min(enough/n,persalt/n)));
		
	}

}
