package ArraysAssignment;

public class EvenOdd {
	
	public static void main(String[] args) {
		int a[]={12,34,56,77,1};
		int[] even=new int[5];
		//int even[];
		int[] odd=new int[5];
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even[i]=a[i];
			}
			else {
				odd[i]=a[i];
			}
		
		}
		System.out.println("Even Array");
		for(int i=0;i<even.length;i++) {
			System.out.println(even[i]);
			
		}
		System.out.println("Odd Array");
		for(int i=0;i<odd.length;i++) {
			System.out.println(odd[i]);
			
		}
		
	}
}
