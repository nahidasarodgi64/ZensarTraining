package ObjectandClass;

public class Employee {
	private int id,salary=0;
	private String name;
	
	void setId(int Id) {
		id=Id;
	}
	void setName(String N) {
		name=N;
	}
	void setSalary(int sal) {
		salary=sal;
	}
	public int getId() {
		return id;
		
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(101);
		e.setName("XYZ");
		e.setSalary(30000);
		System.out.println("ID of employee="+e.getId());
		System.out.println("Name of employee="+e.getName());
		System.out.println("Salary of emplyee="+e.getSalary());
		
	}
}
