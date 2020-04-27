package sectionMain;

import java.util.Scanner;

public class P4A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight = 0, f=2,s = 0,count=0;
		Scanner mScanner = new Scanner(System.in);
		weight = mScanner.nextInt();
		int dy = weight;
		while (weight>=2) {
			if (weight%2==0) {//2
				s=weight;
				int ew = s+f;
				if (ew==dy) {
					count=1;
					break;
					}
				}

			weight--;
			}
		if (count==1) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		}
		
	}
