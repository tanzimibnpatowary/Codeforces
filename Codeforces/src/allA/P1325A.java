package allA;

/*
 * @author Tanzim Ibn Patowary
 * Created  May 3, 2020 9:32:18 PM
 */
public class P1325A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 14;
		int n2 = 2;
		while (n1 != n2) {
			if (n1 > n2) {
				n1 -= n2;
			}
			else {
				n2 -= n1;
			}
		}
		System.out.println(n1);
	}

}
