package ContainmentInheritance;

public abstract class Teacher {
	public int Tid;
	public long Mobile;
	public String Tname;
	Teacher(int id,String name,long mob){
		Tid=id;
		Tname=name;
		Mobile=mob;
	}
	abstract void salary();
	

}
