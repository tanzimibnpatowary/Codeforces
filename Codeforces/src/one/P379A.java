package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 1, 2020 11:04:37 PM
 */
public class P379A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int a = mScanner.nextInt();
		int b = mScanner.nextInt();
	    int total = 0, full = a, partial =0;
	    while(full > 0){
	        total += full;//6=8
	        partial += full;//6=14
	        full = partial / b;//0
	        partial %= b;//0
	    }
	    System.out.println(total);
	}

}
