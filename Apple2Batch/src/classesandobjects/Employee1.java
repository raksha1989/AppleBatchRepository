package classesandobjects;

public class Employee1 {

	int id,salary;
	String name,dept;
	static String compname; //class level 
	//static variables are allocated memory only once at the time of class loading
	
	static void auditorium()
	{
		System.out.println("auditorium is common for all the employees");
	}
	
	/*static void checkin()
	{
		
	}*/
	
	void display()
	{
		System.out.println("inside display method..");
	}
	
	static void input()
	{
		compname="Infosys"; //can initialize only static variable
		//name="Riya";
	}
	
	Employee1(int id,String name,String dept,int salary)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		
	}
	
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary;
	}
	
	public static void main(String[] args) {
		
		input();  //static
		System.out.println(compname);
		
		Employee1 e= new Employee1(101,"Ramesh","HR",70000);
		e.display();
	}
	
}
