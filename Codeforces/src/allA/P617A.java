package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 9:42:55 AM
 */
public class P617A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int target = mScanner.nextInt();
		int[] position = {1, 2, 3, 4 , 5};
		int count = 0;
		
		int j = position.length -1;
		while (target!=0) {
			if (target>=5) {
				target-=5;
				count++;
			}else if(target==4) {
				target-=4;
				count++;
			}else if (target==3) {
				target-=3;
				count++;
			}else if (target==2) {
				target-=2;
				count++;
			}else if (target==1) {
				target-=1;
				count++;
			}
		}
		System.out.println(count);
	}

}
