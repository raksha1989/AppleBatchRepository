package encapsulation;

public class Addition {
	
	
	void add(int a,int b)  //add(int,int)
	{
		System.out.println("Addition of two integers is: "+(a+b));
	}
	
	/*void add(int c,int d)  //add(int,int)
	{
		System.out.println("Addition is: "+(a+b));
	}*/
	
	void add(String a,String b) //data type is different  add(String,String)
	{
		System.out.println("Addition of String is: "+(a+b));
	}
	
	void add(int a,int b,int c) //no of parameters are different
	{
		System.out.println("Addition 3 integer parameters is: "+(a+b+c));
	}
	
	void add(int id,String name) //add(int,String)
	{
		System.out.println("Addition of int and String is: "+id+" "+name);
	}
	
	void add(String name,int marks) //sequence of parameters is different
	{
		System.out.println("Addition of String and int is: "+name+" "+marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Addition a1= new Addition();
		
		a1.add(100, 200);
		
		a1.add("ABC", "XYZ");
		
		//a1.add(100.5f, 20.4f);
		
		a1.add("Anjali", 75);

	}

}
