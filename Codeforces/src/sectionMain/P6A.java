package sectionMain;

import java.util.Arrays;
import java.util.Scanner;

public class P6A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[4];
		Scanner mScanner = new Scanner(System.in);
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=mScanner.nextInt();//7224
		}
		Arrays.sort(myArray);//2247
		int firstD = myArray[1]+myArray[2]-myArray[3];
		int secondD = myArray[0]+myArray[1]-myArray[2];
		if (firstD>0 || secondD>0) {
			System.out.println("TRIANGLE");
		}else if (firstD==0 || secondD==0) {
			System.out.println("SEGMENT");
		}else {
			System.out.println("IMPOSSIBLE");
		}
		
	}

}
