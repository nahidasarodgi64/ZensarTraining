package ObjectandClass;

public class AreaOverloading {
	
	static double result=0;
	static int r;
	static void Area(int radius,double pie) {
		r=radius;
		result=2*radius*pie;
		System.out.println("Area of circle="+result);
	}
	static void Area(int length,int breath) {
		result=2*length*breath;
		System.out.println("Area of rectangle="+result);
	}
	static void Area(int side) {
		result=side*side*side;
		System.out.println("Area of triangle="+result);
	}
	public static void main(String[] args) {
		AreaOverloading.Area(12);
		AreaOverloading.Area(23,40);
		AreaOverloading.Area(6,3.14);
	}
	

}
