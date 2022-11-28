package classesandobjects;

public class ABC {
	
	
	ABC()
	{
		this(10);//constructor call shld be the first stmt
		System.out.println("inside Simple  constructor");
		//this(10);
	}
	
	ABC(int x)
	{
		this("ABC");
		System.out.println("inside 1 parameter  constructor");
	}
	
	ABC(int x,int y)
	{
		this("ABC");
		System.out.println("inside 2 parameter  constructor");
	}
	
	ABC(String z)
	{
		this(10);
		System.out.println("inside String parameter  constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
