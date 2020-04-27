package one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 24, 2020 4:42:42 PM
 */
public class P19D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		ArrayList<Integer> forx = new ArrayList<Integer>();
		ArrayList<Integer> fory = new ArrayList<Integer>();
		int f = 0;
		int d = 0;
		int target = mScanner.nextInt();
		for (int i = 0; i < target; i++) {
			String how = mScanner.next();
			int x = mScanner.nextInt();
			int y = mScanner.nextInt();
			
			if (how.equals("add")) {
				forx.add(x);
				fory.add(y);
				
			}else if (how.equals("find")) {
				System.out.println(forx.get(x));
				System.out.println(fory.get(y));
			}else if (how.equals("remove")) {
					forx.remove(forx.indexOf(x));
					fory.remove(fory.indexOf(y));
			}
		}
	}

}
