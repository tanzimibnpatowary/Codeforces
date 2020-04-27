package sectionMain;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class P4C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target;
		Scanner mScanner = new Scanner(System.in);
		HashSet<String> mSet = new HashSet<String>();
		target = mScanner.nextInt();
		int t = 1;
		for (int i = 1; i < target; i++) {
			String value = mScanner.next();
			
			if (mSet.isEmpty()) {
				mSet.add(value);
				System.out.println("Ok");
			}
			if (mSet.contains(value)) {
					System.out.println(value+""+t++);
					mSet.add(value);
				
			}else {
				mSet.add(value);
			}
		}
	}

}
