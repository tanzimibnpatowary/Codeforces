package one;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 1:02:20 AM
 */
public class P778A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int people = mScanner.nextInt();
		int[] precoin = new int[people];
		int max = 0;
		for (int i = 0; i < people; i++) {
			precoin[i] = mScanner.nextInt();
			if (max<precoin[i]) {
				max = precoin[i];
			}
		}
		int count = 0;
		Arrays.sort(precoin);
		if (precoin.length==1) {
			System.out.println(0);
		}else {
			for (int i = 0; i < precoin.length-1; i++) {
				count += max-precoin[i];
			}
			System.out.println(count);
		}
		
		
	}

}
