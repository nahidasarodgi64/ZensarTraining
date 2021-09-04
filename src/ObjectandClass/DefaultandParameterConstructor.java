package ObjectandClass;

public class DefaultandParameterConstructor {
	public int AccountNo;
	public String CustomerName;
	
	DefaultandParameterConstructor(){
		System.out.println("I am in default Constructor");
		AccountNo=1234;
		CustomerName="Xyz";
		System.out.println("AccountNumber="+AccountNo+"Name="+CustomerName);
	}
	
	DefaultandParameterConstructor(int AN,String  CN){
		AccountNo=AN;
		CustomerName=CN;
		System.out.println("I am in Parameterzied Constructor");
		System.out.println("Account number="+AccountNo+"Name="+CustomerName);
		
	}
	
	
	public static void main(String[] args) {
		DefaultandParameterConstructor d1=new DefaultandParameterConstructor(6778,"Abc");
		DefaultandParameterConstructor d2=new DefaultandParameterConstructor();
		
	}
	
}
