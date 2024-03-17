package javaPrograms;

public class StringWordCount {

	public static void main(String[] args) {
		
		String s = "WebT esting Web browser Web driver";
		
		int found=0;
		int count=0;
		for(; s.indexOf("Web",found)!=-1;) {
			count++;
			found = s.indexOf("Web", found)+1;
		}
		System.out.println("Web is repeted for: "+count+" times");
	

	}

}
