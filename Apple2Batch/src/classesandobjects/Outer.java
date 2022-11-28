package classesandobjects;

public class Outer {
	
	int a=100;
	static int b=200;

	//non-static: can access static as well as non-static directly
	void display()
	{
		System.out.println(a+" "+b);
	}
	
	//static:  can access only static directly
	//         to access non-static member it requires an object
	static void show()
	{
		System.out.println(a+" "+b);
		Outer o= new Outer();
		System.out.println(o.a);
	}
	
	public static void main(String[] args) {
		
	}
	
	/*static class Inner
	{
		void display()
		{
			System.out.println(a+" "+b);
		}
	}*/
	
	

}
