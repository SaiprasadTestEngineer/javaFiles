package javaPrograms;

import java.util.Scanner;

public class SwappingOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("i value before: ");
		int i = sc.nextInt();
		System.out.print("j value before: ");
		int j=sc.nextInt();
		
		i = i + j;   //5+ 2 = i = 7;
		j = i - j;   //j=5
        i = i - j;	 //2
        System.out.print("i value after: "+i+"\n");
        System.out.print("j value after: "+j);
        sc.close();
	}

}
