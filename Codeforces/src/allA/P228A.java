package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 30, 2020 2:39:07 PM
 */
public class P228A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int[] colors = new int[4];
		for (int i = 0; i < colors.length; i++) {
			colors[i] = mScanner.nextInt();
		}
		int output = 0;
		if (colors[1] == colors[0]) {
			++output;
		}
		if (colors[2] == colors[0] || colors[2] == colors[1]) {
			++output;
		}
		if (colors[3] == colors[0] || colors[3] == colors[1] || colors[3] == colors[2]) {
			++output;
		}
		System.out.println(output);
	}

}
