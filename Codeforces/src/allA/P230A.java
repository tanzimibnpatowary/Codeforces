package allA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 30, 2020 8:40:48 PM
 */
public class P230A {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int inibre = mScanner.nextInt();
		int target = mScanner.nextInt();
		ArrayList<Integer> key = new ArrayList<Integer>();
		ArrayList<Integer> value = new ArrayList<Integer>();
		for (int i = 0; i < target; i++) {
			int x = mScanner.nextInt();
			int y = mScanner.nextInt();
			key.add(x);
			value.add(y);
		}
		for (int i = 0; i < key.size(); i++) {
			for (int j = 0; j < key.size(); j++) {
				if (inibre>key.get(j)) {
					inibre+=value.get(j);
					key.remove(j);
					value.remove(j);
					
				}
				System.out.println(inibre);
			}
		}
	}

}
