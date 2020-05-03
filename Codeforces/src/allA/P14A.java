package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 21, 2020 11:40:57 AM
 */
public class P14A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int row = mScanner.nextInt();
		int col = mScanner.nextInt();
		char[][] matrix = new char[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = mScanner.next().charAt(0);
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%c", matrix[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
