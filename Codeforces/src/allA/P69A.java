package allA;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 27, 2020 4:55:13 PM
 */
public class P69A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		
		int sumx = 0;
		int sumy = 0;
		int sumz = 0;
		int x,y,z=0;
		int n = mScanner.nextInt();
	    for(int i=0; i<n; i++)
	    {
	        x = mScanner.nextInt();
	        y = mScanner.nextInt();
	        z = mScanner.nextInt();
	        sumx+=(x);
	        sumy+=(y);
	        sumz+=(z);
	    }
	    if(sumx==0 && sumy==0 && sumz==0) {
	    	System.out.println("YES");
	    }else {
	    	System.out.println("NO");
		}
	    
	}

}
