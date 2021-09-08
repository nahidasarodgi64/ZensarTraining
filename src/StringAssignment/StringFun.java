package StringAssignment;

public class StringFun {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="XYZ";
		String s3="hello";
		String s4="ABCHelloDFE";
		System.out.println("Chracter At zero place="+s1.charAt(0));
		System.out.println("Chracter At 2nd place="+s1.charAt(2));
		System.out.println("Compare the String="+s1.compareTo(s3));
		System.out.println("Compare to ignore case="+s1.compareToIgnoreCase(s3));
		System.out.println("Concate the String="+s1.concat(s2));
		System.out.println(s4.contains(s1));
		System.out.println("Ends with="+s4.endsWith("lO"));
		System.out.println("Length="+s4.length());
		
	}

}
