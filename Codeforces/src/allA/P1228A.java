package allA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 6, 2020 11:18:25 PM
 */
public class P1228A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner= new Scanner(System.in);
		int l = mScanner.nextInt();
		int r = mScanner.nextInt();
		for (int i = l; i <=r; i++) {
			String string = String.valueOf(i);
			char[] ch = string.toCharArray();
			Arrays.sort(ch);
			int k = 0;
			int nochange = 0;
			for (int j = 1; j < ch.length; j++) {
				if (ch[j]==ch[k]) {
					nochange = 1;
				}
				k++;
			}
			if (nochange==0) {
				System.out.println(string);
				break;
			}
			if (i==r) {
				System.out.println(-1);
			}
			k=0;
			nochange = 0;
		}
	}

}
