package javaPrograms;

import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		int prime = cs.nextInt();
		int count=0;
	      for(int i=1;i<=prime;i++) {
	    	  if(prime%i==0) {
	    		   count++;
	    	  }
	      }
		if(count==2) {
			System.out.println("prime number: "+prime);
		} else {
			System.out.println("not a prime number: "+prime);
		}
//		int i = 64;
//		System.out.println(Math.sqrt(i)); i means prime number
		cs.close();
	}
	}
			
	

		
	
	


