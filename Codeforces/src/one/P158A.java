package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 9:47:45 AM
 */
public class P158A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target = mScanner.nextInt();
		int	checkValue = mScanner.nextInt();
		int result = 0;
		int array[] = new int[51];
		for (int i = 0; i < target; i++) {
			array[i] = mScanner.nextInt();
			
		}
		int val = array[checkValue-1];
		for (int i = 0; i < target; i++) {
			if (array[i]>=val&&array[i]!=0) {
				result++;
			}
		}
		System.out.println(result);
	}

}
