package one;

import java.util.Scanner;

/*
 * @author Tanzim Ibn Patowary
 * Created  Apr 28, 2020 10:07:07 AM
 */
public class P131A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mScanner = new Scanner(System.in);
		String xString = mScanner.nextLine();
		char[] upper = xString.toCharArray();
		int count = 0;
		for(int i=1; i<upper.length; i++)
	    {
	        if(upper[i]>=65&&upper[i]<=90)
	        {
	        	count++;
	        }
	    }
	    if(count==upper.length-1)
	    {
	        for(int i=0; i<upper.length; i++)
	        {
	            if(upper[i]>=65&&upper[i]<=90)
	            	upper[i]=(char) (97+upper[i]-65);
	            else if(upper[i]>=97&&upper[i]<=122)
	            	upper[i]=(char) (65+upper[i]-97);
	        }
	    }
		for (int i = 0; i < upper.length; i++) {
			System.out.print(upper[i]);
		}
	}

}
