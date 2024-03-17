package javaPrograms;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n number");
		int n = sc.nextInt();
		int revNum =0;
		while(n!=0) {
			int remainder = n%10; //12345 -> 1234; 1234->123; 12 ; 2   
			revNum = revNum*10+remainder;  //0*10+5=5; 5*10+4=>50+4=54; 54*10+3=>543 ; 5432
			n = n/10;  //1234 //123 //12 //2
		}
		System.out.println(revNum);
	}
}
