package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 11:17:34 AM
 */
public class P266B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		int kid = mScanner.nextInt();
		int seconds = mScanner.nextInt();
		String mString = mScanner.next();
		char[] s = mString.toCharArray();
		while(seconds!=0)
	    {
	        for(int i=1;i<kid;i++)
	        {
	            if(s[i]=='G' && s[i-1]=='B')
	            {
	                s[i]='B';
	                s[i-1]='G';
	                i++;
	            }
	       }
	        seconds --;
	    }
		//B G G B G
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
	}

}
