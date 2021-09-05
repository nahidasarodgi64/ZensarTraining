package ArraysAssignment;
public class NegativeValue {
	public static void main(String[] args) {

		int a[]= {4,-4,56,-7,12,-2,9};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				System.out.println(a[i]+" ");
				count+=1;
			}
		
		}
		System.out.println("Negative Number are="+count);

}
}
