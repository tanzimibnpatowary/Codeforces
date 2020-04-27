package one;

import java.math.BigInteger;
import java.util.Scanner;

public class P112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a,b;
		Scanner mScanner = new Scanner(System.in);
		a = mScanner.nextBigInteger();
		b = mScanner.nextBigInteger();
		BigInteger first = a.pow(b.intValue());
		BigInteger second = b.pow(a.intValue());
		BigInteger result = first.subtract(second);
		System.out.println(result);
		
	}

}
