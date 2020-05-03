package allA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 1, 2020 1:25:39 PM
 */
public class P1154A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int max = 0;
		int[] num = new int[4];
		for (int i = 0; i < 4; i++) {
			num[i] = mScanner.nextInt();
			if (max<num[i]) {
				max = num[i];
			}
		}
		Arrays.sort(num);
		System.out.println((max-num[0])+" "+(max-num[1])+" "+((max-num[2])));
	}

}
