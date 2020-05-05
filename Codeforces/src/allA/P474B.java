package allA;

import java.util.HashMap;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 4, 2020 9:26:03 PM
 */
public class P474B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int t = mScanner.nextInt();
		HashMap<Integer, Integer> nMap = new HashMap<Integer, Integer>();
		int sum = 0;
		for (int i = 0; i < t; i++) {
			int temp = mScanner.nextInt();
			for (int j = 0; j < temp; j++) {
				nMap.put(++sum, i + 1);
			}
		}
		int m = mScanner.nextInt();
		for (int i = 0; i <m; i++) {
			int inq = mScanner.nextInt();
			System.out.println(nMap.get(inq));
		}
	}

}
