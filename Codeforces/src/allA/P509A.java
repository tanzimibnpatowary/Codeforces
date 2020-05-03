package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 2, 2020 6:54:42 PM
 */
public class P509A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int n = mScanner.nextInt();
		int[][] myArray = new int[n][n];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i][0] = 1;
			myArray[0][i] = 1;
		}
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				myArray[i][j] = myArray[i][j-1]+myArray[i-1][j];
			}
		}
		System.out.println(myArray[n-1][n-1]);
		
	}

}
