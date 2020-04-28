package one;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 10:41:10 PM
 */
public class P158B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int group = mScanner.nextInt();
		int car = 0;
		int sum = 0;
		int[] member = new int[group];
		for (int i = 0; i < group; i++) {
			member[i] = mScanner.nextInt();
		}
		Arrays.sort(member);
		for (int i = 0; i < member.length; i++) {
			if (member[i]==4||member[i]==3) {
				car++;
			}else {
				sum = sum + member[i];
				if (sum>=3 || sum>=4) {
					car++;
					sum = 0;
				}
			}
		}
		if (sum>0) {
			System.out.println(car+1);
		}else {
			System.out.println(car);
		}
		
	}

}
