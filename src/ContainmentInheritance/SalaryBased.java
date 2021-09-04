package ContainmentInheritance;

public class SalaryBased extends Teacher{
	int salary;
	SalaryBased(int id, String name, long mob,int salary) {
		super(id, name, mob);
		// TODO Auto-generated constructor stub
		this.salary=salary;
		
	}
	@Override
	void salary() {
		// TODO Auto-generated method stub
		System.out.println("Salary="+salary);
	}
	/*public static void main(String[] args) {
		Teacher t1=new SalaryBased(101,"ABC",2367895634L,3000);
		t1.salary();
		
		
	}*/
}
