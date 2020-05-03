package allA;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 2, 2020 8:23:47 PM
 */
public class P749A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int num = mScanner.nextInt();
		int p = 2;
		int p1 = 3;
		int sum = 0;
		int rem = 0;
		if (num%2!=0) {
			rem = 1;
		}
		int count = 0;
		ArrayList<Integer> mList = new ArrayList<Integer>();
		while (sum!=num) {
			if (rem==1) {
				count++;
				mList.add(3);
				sum = sum + p1;
				rem = 0;
			}else {
				count++;
				sum = sum + p;
				mList.add(2);
			}
		}
		System.out.println(count);
		for (int i = 0; i < mList.size(); i++) {
			System.out.print(mList.get(i)+" ");
		}
	}

}
