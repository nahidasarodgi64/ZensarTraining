package ArraysAssignment;

public class CopyArray {
	public static void main(String[] args) {
		int[] a= {12,4,6,2};
		int[] b=new int[4];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
	
	for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
	}

}
}