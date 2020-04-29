package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 29, 2020 9:14:28 AM
 */
public class P112A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String x = mScanner.next();
		String y = mScanner.next();
		x = x.toLowerCase();
		y = y.toLowerCase();
		char[] xx = x.toCharArray();
		char[] yy = y.toCharArray();
		int comparison = 0;
		for (int k = 0; k < xx.length; ++k) {
			if ((xx[k]) < (yy[k])) {
				comparison = -1;
				break;
			}
			if ((xx[k]) > (yy[k])) {
				comparison = 1;
				break;
			}
		}
		System.out.println(comparison);
//		int countx = 0;
//		int county = 0;
//		for (int i = 0; i < yy.length; i++) {
//			countx = countx + xx[i];
//			county = county + yy[i];
//		}
//		System.out.println(countx);
//		System.out.println(county);
//		if (countx==county) {
//			System.out.println(0);
//		}else if (countx<county) {
//			System.out.println(-1);
//		}else if(countx>county){
//			System.out.println(1);
//		}
	}
//	aslkjddalks
//	aslkjddajwi
}
