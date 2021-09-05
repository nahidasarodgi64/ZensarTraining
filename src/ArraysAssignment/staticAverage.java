package ArraysAssignment;

public class staticAverage {
	static int[] a= {12,4,6,2};
	static double[] d= {12,4,6,2};
	public static int average(int[] array) {
		int avg=0,sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		avg=sum/4;
		return avg;
	}
	
	public static double average(double[] array) {
		int avg=0,sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		avg=sum/4;
		return avg;
		
	}
	public static void main(String[] args) {
		staticAverage s1=new staticAverage();
		System.out.println(s1.average(a));
		System.out.println(s1.average(d));
		
	}
	

}
