package allA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 6, 2020 11:11:32 AM
 */
public class P43A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int tar = mScanner.nextInt();
		int count[] = new int[26];
		String all = "";
		for (int i = 0; i < tar; i++) {
			String string = mScanner.next();
			 all = string;
			char[] mychar = string.toCharArray();
 			for (int j = 0; j < mychar.length; j++) {
				count[mychar[j]-'A'] = count[mychar[j]-'A']+1;
			}
 			
		}
		
		int max = 0;
		int one = 0;
		
		int res = 0;
		for (int i = 0; i < count.length; i++) {
			if (max<count[i]) {
				one = 0;
				res = i;
				max = count[i];
			}else if(max==count[i]) {
				one = 1;
			}
		}
		if (one==0) {
			System.out.println((char)(res+65));
		}else {
			System.out.println(all);
		}
	}

}
