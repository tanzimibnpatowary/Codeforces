package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 11:56:43 AM
 */
public class P59A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String mString = mScanner.nextLine();
		int CAPcount = 0;
		int Smacount = 0;
		char ch[] = mString.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='A' && ch[i]<='Z') {
				CAPcount++;
			}else if (ch[i]>='a' && ch[i]<='z') {
				Smacount++;
			}
		}
		if (CAPcount==Smacount) {
			System.out.println(mString.toLowerCase());
		}else if (CAPcount>Smacount) {
			System.out.println(mString.toUpperCase());
		}else {
			System.out.println(mString.toLowerCase());
		}
	}

}
