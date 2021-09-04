package ContainmentInheritance;

public class HoursbasedSalarybasedMainClass {
	public static void main(String[] args) {
		Teacher t1=new SalaryBased(101,"ABC",2367895634L,3000);
		t1.salary();
		Teacher t2=new Hourlybased(101,"ABC",2367895634L,500,48);
		t2.salary();
		
	}

}
