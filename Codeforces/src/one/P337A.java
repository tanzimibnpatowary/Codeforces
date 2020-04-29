package one;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 9:26:08 PM
 */
public class P337A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int item = mScanner.nextInt();
		int prod = mScanner.nextInt();
		int[] all = new int[prod];
		for (int i = 0; i < all.length; i++) {
			all[i] = mScanner.nextInt();
		}
		Arrays.sort(all);
		int output = 10001;
		for(int k = 0; k <= prod - item; k++){
	        int diff =  all[k + item - 1] -all[k];
	        if(diff < output){
	        	output = diff;
	        	} 
	    }
		System.out.println(output);

	}

}
