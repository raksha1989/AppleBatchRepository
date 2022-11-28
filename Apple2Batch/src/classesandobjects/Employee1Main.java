package classesandobjects;

public class Employee1Main {
	
	static int a;
	int b=100;
	
	static
	{
		a=100;// access and initialize only static variables
		System.out.println("static block 1");
	}
	
	static 
	{
		System.out.println("static block 2 "+a);
	}
	
	static 
	{
		System.out.println("static block 3 ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Employee1.compname);
		
		Employee1.auditorium();//they do not require object to be called
		Employee1.input();
		
		Employee1 e1= new Employee1(101,"Riya","HR",60000);
		Employee1 e2= new Employee1(102,"Sanjay","Marketing",50000);
		Employee1 e3= new Employee1(103,"Anjali","HR",65000);
		
		System.out.println(e1.name+" "+e1.salary+" "+Employee1.compname);
		e1.display();
		
	}

}
