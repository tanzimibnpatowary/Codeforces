package allA;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 5:14:36 PM
 */
public class P58A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		char[] greeting = {'h','e','l','l','o'};
		String x = mScanner.nextLine();
		char[] line = x.toCharArray();
		int a = 0, b = 0; String output = "NO";
	    while(b < line.length){
	        if(line[b++] == greeting[a]){a++;}
	        if(a >= greeting.length){output = "YES"; break;}
	    }
	    if (output.contains("YES")) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
