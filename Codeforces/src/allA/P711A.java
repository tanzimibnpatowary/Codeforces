package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 7, 2020 5:44:43 PM
 */
public class P711A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int row = mScanner.nextInt();
		String[] arrStrings = new String[row];
		int check = 0;
		int hello = 0;
		for (int i = 0; i < arrStrings.length; i++) {
			arrStrings[i] = mScanner.next();
			StringBuilder mBuilder = new StringBuilder();
			if (hello != 1) {
				if (arrStrings[i].indexOf("OO") == 0) {
					String sub = arrStrings[i].substring(3, 5);
					mBuilder.append("++|" + sub);
					arrStrings[i] = mBuilder.toString();
					hello = 1;
					check = 1;
				} else if (arrStrings[i].indexOf("OO") == 3) {
					String sub = arrStrings[i].substring(0, 2);
					mBuilder.append(sub + "|++");
					arrStrings[i] = mBuilder.toString();
					hello = 1;
					check = 1;
				}
			}
		}
		if (check == 1) {
			System.out.println("YES");
			for (int i = 0; i < arrStrings.length; i++) {
				System.out.println(arrStrings[i]);
			}
		} else {
			System.out.println("NO");
		}
		

	}

}
///*import java.util.Scanner;
//
///*
// * @author Tanzim Ibn Patowary
// * Created  May 7, 2020 5:44:43 PM
// */
//public class P711A {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//		String[] rows = new String[n];
//		for (int i = 0; i < rows.length; i++) {
//			rows[i] = sc.next();
//		}
//		System.out.println(solve(rows));
//
//		sc.close();
//	}
//
//	static String solve(String[] rows) {
//		for (int i = 0; i < rows.length; i++) {
//			if (rows[i].contains("OO")) {
//				rows[i] = rows[i].replaceFirst("OO", "++");
//
//				return String.format("YES\n%s", String.join("\n", rows));
//			}
//		}
//
//		return "NO";
//	}
//
//}
//*/