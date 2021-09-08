package ContainmentInheritance;

public class Mastani implements IceCream,Juice{
	public static void main(String[] args) {
		
		Mastani m1=new Mastani();
		IceCream.eat();
		Juice.drink();
	}

}
