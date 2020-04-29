package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 2:20:36 PM
 */
public class P497A {
//			1+2*3=7
//			1*(2+3)=5
//			1*2*3=6
//			(1+2)*3=9
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int a = mScanner.nextInt();
		int b = mScanner.nextInt();
		int c = mScanner.nextInt();
		int max = 0;
		int go = a+b*c;
		if (max<go) {
			max = go;
		}
		int go1 = a*(b+c);
		if (max<go1) {
			max = go1;
		}
		int go2 = a*b*c;
		if (max<go2) {
			max = go2;
		}
		int go3 = (a+b)*c;
		if (max<go3) {
			max = go3;
		}
		int go4 = (a+b)+c;
		if (max<go4) {
			max = go4;
		}
		int go5 = (a*b)+c;
		if (max<go5) {
			max = go5;
		}
		System.out.println(max);
	}

}
