package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 29, 2020 5:43:47 PM
 */
public class P785A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int t = mScanner.nextInt();
		int sum = 0;
		for (int i = 0; i < t; i++) {
			String xString = mScanner.next();
			if (xString.equals("Icosahedron")) {
				sum = sum + 20;
			}else if (xString.equals("Dodecahedron")) {
				sum = sum + 12;
			}else if (xString.equals("Octahedron")) {
				sum = sum + 8;
			}else if (xString.equals("Cube")) {
				sum = sum + 6;
			}else if (xString.equals("Tetrahedron")) {
				sum = sum + 4;
			}
		}
		System.out.println(sum);
	}

}
