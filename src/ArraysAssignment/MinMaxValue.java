package ArraysAssignment;

public class MinMaxValue {
	int a[]={12,34,56,78,1};
	int max=0,min=0;
	void Max() {
		 for(int i=0;i<a.length;i++) {
			 for(int j=i;j<a.length;j++) {
				 if(a[i]>a[j]) {
					 max=a[i];
					 
				 	}
			 	}
			 
		 	}
		 System.out.println("Max value="+max);
			
		}
	void Min() {
		 for(int i=0;i<a.length;i++) {
			 for(int j=i;j<a.length;j++) {
				 if(a[i]>a[j]) {
					 min=a[j];
					 
				 	}
			 	}
			 
		 	}
		 System.out.println("Min value="+min);
			
	}
	public static void main(String[] args) {
		
		MinMaxValue m1=new MinMaxValue();
		m1.Max();
		m1.Min();
	}

}


