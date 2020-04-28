package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 1:07:53 PM
 */
public class P136A {
//	4
//	2 3 4 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int numFriends = mScanner.nextInt();
		int perm[] = new int[numFriends+1];
		int temp = 0;
		for(int k = 1; k <= numFriends; ++k){
			temp = mScanner.nextInt();
			perm[temp] = k;
			}
	    for(int k = 1; k <= numFriends; ++k){
	    	System.out.print(perm[k]+" ");
	    	}
	}

}
