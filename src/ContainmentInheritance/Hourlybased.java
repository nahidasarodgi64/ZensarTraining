package ContainmentInheritance;

public class Hourlybased extends Teacher{
	public int rate_per_hr;
	int hrs;
	Hourlybased(int tid,String name,long mobile,int rph,int h){
		super(tid,name,mobile);
		rate_per_hr=rph;
		hrs=h;
	}
	@Override
	void salary() {
		// TODO Auto-generated method stub
		System.out.println("Salary="+(hrs*rate_per_hr));
		
		
	}
	
	/*public static void main(String[] args) {
		Teacher t1=new Hourlybased(101,"ABC",2367895634L,500,48);
		t1.salary();
		
		
	}*/


}
