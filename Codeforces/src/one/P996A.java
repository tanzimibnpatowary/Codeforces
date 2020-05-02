package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 1, 2020 1:02:35 PM
 */
public class P996A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int x = mScanner.nextInt();
		int count = 0;
		while (x!=0) {
			if (x%100==0) {
				x = x -100;
				count++;
			}else if (x%20==0) {
				x = x -20;
				count++;
			}else if (x%10==0) {
				x = x -10;
				count++;
			}else if (x%5==0) {
				x = x -5;
				count++;
			}else if (x%1==0) {
				x = x -1;
				count++;
			}
			
		}
		System.out.println(count);
	}

}
