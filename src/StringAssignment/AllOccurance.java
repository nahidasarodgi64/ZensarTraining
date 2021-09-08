package StringAssignment;

public class AllOccurance {
	public static void main(String[] args) {
		String s1="Hello Java";
		int len=s1.length();
		int counter[]=new int[265];
		for(int i=0;i<len;i++) {
			counter[s1.charAt(i)]++;
		}
		char array[]=new char[s1.length()];
		for(int i=0;i<len;i++) {
			array[i]=s1.charAt(i);
			int flag=0;
			for(int j=0;j<=i;j++) {
				
				if(s1.charAt(i)==array[j])
					flag++;
			}
			if(flag==1)
				System.out.println("Occuurance of charcter "+s1.charAt(i)+" in string is:"+counter[s1.charAt(i)]);
		}
	}
}
