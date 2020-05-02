package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 12:40:30 AM
 */
public class P750A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int question = mScanner.nextInt();
		int howfar = mScanner.nextInt();
		int count = 0;
		
		int initime = 4*60;
		int time = initime - howfar;
		int solvetime = 0;
		for (int i = 1; i <=question; i++) {
			solvetime = solvetime + (5*i);
			if (solvetime<=time) {
				count++;
			}else {
				i = question;
			}
		}
		System.out.println(count);
	}

}
