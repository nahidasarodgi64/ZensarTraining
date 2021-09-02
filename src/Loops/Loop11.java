package Loops;


public class Loop11{
	public static void main(String[] args){
		int start=400,end=300;
		while(start>end){
			boolean flag=false;
			for(int i=2;i<=end/2;++i){
				if(end%i==0){
					flag=true;
					break;
				}
			}
			if(!flag && end!=0 && end!=1)	
				System.out.println(end+" ");
			++end;
		}
}
}