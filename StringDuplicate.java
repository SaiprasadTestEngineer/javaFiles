package javaPrograms;

import javax.management.StringValueExp;

public class StringDuplicate {

	public static void main(String[] args) {
		
		String s = "Programming";
		String s1="";
		int count;
		for(int i=0; i<s.length();i++) {
			if(s1.contains(String.valueOf(s.charAt(i)))==false){   //String. value of convert char to string
				s1=s1+s.charAt(i); //Programming stote the characters
			count=1;
			
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
				count++;
			}
		}
			System.out.println(s.charAt(i)+" is reapeted "+count);
		
	}
		}
}
}
