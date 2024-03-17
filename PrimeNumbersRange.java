package javaPrograms;

import java.util.Scanner;

public class PrimeNumbersRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter upto range");
		int pr = sc.nextInt();
		System.out.println("enter from starting prime");
		int i=sc.nextInt();
		int count;


		for(;i<=pr;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}

			}
			if(count==2) {
				System.out.println("Prime numbers: "+i);
			}
			sc.close();
		}
		

	}

}
