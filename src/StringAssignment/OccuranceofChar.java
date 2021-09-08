package StringAssignment;

public class OccuranceofChar {
	public static void main(String[] args) {
		
	
		String s1="JavaProJgarmJ";
		int count=0;
		char c=s1.charAt(0);
		for(int i=0;i<s1.length();i++) {
			
			if(s1.charAt(i)==c) {
				count++;
			}
		}
		System.out.println("Number of occurance="+count);
	}
	

}

