package one;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 1:13:37 AM
 */
public class P723A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int[] mydistance = new int[3];
		for (int i = 0; i < mydistance.length; i++) {
			mydistance[i] = mScanner.nextInt();
		}
		Arrays.sort(mydistance);
		int sum = 0;
		sum+=mydistance[mydistance.length-1]-mydistance[1];
		sum+=mydistance[1]-mydistance[0];
		System.out.println(sum);
	}

}
