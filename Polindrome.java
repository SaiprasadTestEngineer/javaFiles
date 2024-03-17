package javaPrograms;

import java.util.Scanner;

public class Polindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a String word: ");
	  String s = sc.nextLine();
	  String rev="";
	  
	 for( int i = s.length()-1; i>=0; i--) {
		 rev = rev+s.charAt(i);
		 
	 }
	 System.out.println(rev);
	 if(s.equals(rev)) {
		 System.out.println("polindrome String");
	 }else {
		 System.out.println("not a polindrome String");
	 }
	}

}
