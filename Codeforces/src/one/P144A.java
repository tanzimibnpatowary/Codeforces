package one;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 30, 2020 2:46:16 PM
 */
public class P144A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target = mScanner.nextInt();
		int minSoldier = 101, maxSoldier = 0, minPos = 100, maxPos = 0;
		for (int i = 0; i < target; i++) {
			int currentSoldier = mScanner.nextInt();
			if (currentSoldier > maxSoldier) {
				maxPos = i;
				maxSoldier = currentSoldier;
			}
			if (currentSoldier <= minSoldier) {
				minPos = i;
				minSoldier = currentSoldier;
			}
		}
		int output = maxPos + (target - 1 - minPos);
		if (minPos < maxPos) {
			--output;
		}
		System.out.println(output);
	}

}
