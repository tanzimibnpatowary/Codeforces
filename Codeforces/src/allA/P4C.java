package allA;

import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 30, 2020 9:05:07 PM
 */
public class P4C {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedInputStream(System.in));
		int num = Integer.valueOf(in.nextLine());
		String input;
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < num; i++) {
			input = in.nextLine();
			if (map.containsKey(input)) {
				map.put(input, map.get(input) + 1);
				System.out.println(input + map.get(input));
			} else {
				map.put(input, 0);
				System.out.println("OK");
			}
		}
		in.close();
	}
}