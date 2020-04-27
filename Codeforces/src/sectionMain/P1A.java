package sectionMain;

import java.util.Scanner;

public class P1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long length,width,stone,f=0,s=0;
		Scanner mScanner = new Scanner(System.in);
		length = mScanner.nextLong();
		width = mScanner.nextLong();
		stone  = mScanner.nextLong();
		if (length % stone > 0) {
			f = length/stone + (length%stone);		
			}
		if (width % stone > 0) {
			f = length/stone + (width%stone);		
			}
		System.out.println(f*s);
	}

}
