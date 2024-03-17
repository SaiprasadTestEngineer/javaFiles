package javaPrograms;

public class StringAllCharacters {

	public static void main(String[] args) {
	String s = "jlkj fkj124kdkg i09987&^%$ %##+_";
	
	for(int i=0; i<s.length(); i++) {
		//System.out.println(s.charAt(i)); 
		if(Character.isAlphabetic(s.charAt(i))) {
			System.out.println(s.charAt(i)+": is a Char");
		}else if(Character.isDigit(s.charAt(i))) {
			System.out.println(s.charAt(i)+": is a dizit");
		}else if(Character.isSpaceChar(s.charAt(i))) {
		System.out.println(" space given");	
		}
		else  {
			System.out.println(s.charAt(i)+" is special characters");
		}
	}

	}

}
