package javaPrograms;

import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter i: ");
         int i = sc.nextInt();
         System.out.print("enter j: ");
         int j = sc.nextInt();
         System.out.print("enter k: ");
         int k = sc.nextInt();
         
//         if(i>j && i>k) {
//        	 System.out.println(i+" is max number");
//         }
//         if(j>k && j>i) {
//        	 System.out.println(j+" is max number");
//         }
//         if(k>i && k>j) {
//        	 System.out.println(k+" is max number");
//         }
         if(i>j && i>k) {
        	 System.out.println(i+" is max number");
         }
         else if(j>k && j>i) {
        	 System.out.println(j+" is max number");
         }
         else {
        	 System.out.println(k+" is max number");
         }
         sc.close();   //it will close the scanner class
	}

}
