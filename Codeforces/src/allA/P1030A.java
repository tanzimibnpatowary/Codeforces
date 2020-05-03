package allA;

import java.util.Iterator;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 2:59:39 PM
 */
public class P1030A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target = mScanner.nextInt();
		int hard = 0;
		int easy = 0;
		for (int i = 0; i < target; i++) {
			int x= mScanner.nextInt();
			if (x==1) {
				hard++;
			}else {
				easy++;
			}
		}
		if (hard==easy) {
			System.out.println("EASY");
		}else if(easy>0&&hard == 1){
			System.out.println("HARD");
		}else if(hard>0){
			System.out.println("HARD");
		}else {
			System.out.println("EASY");
		}
	}

}
