package classesandobjects;

import java.util.Scanner;

public class Student {
	//this,constructors
	
	//initialize global variables:
	//reference variable
	//method
	//constructor
	
	int id,marks;
	String name,dept; //java
	
	//           i=102 n=Ramesh  d=mech  m=65
	void setData(int id,String name,String dept,int marks)
	{
		id=id;
		name=name;
		dept=dept;
		marks=marks;
		
	}
	
	/*void display()
	{
		//int a=0;
		//System.out.println(a);
		System.out.println(id+" "+name+" "+dept+" "+marks);
	}*/
	
	public String toString()    //Object  //override
	{
		return id+" "+name+" "+dept+" "+marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id,m;
		String name,dept;
		Scanner sc= new Scanner(System.in);
		/*System.out.println("Enter the number of students: ");
		int num=sc.nextInt();  //500
*/		
		/*for(int i=1;i<=num;i++)
		{*/
			//System.out.println("Enter the data for "+i+" student: ");
			System.out.println("Enter the id: ");
			id= sc.nextInt();
			System.out.println("Enter the name: ");
			name= sc.next();
			System.out.println("Enter the dept: ");
			dept= sc.next();
			System.out.println("Enter the marks: ");
			m= sc.nextInt();
			
			Student s= new Student();
			s.setData(id, name, dept, m);
			//s.display();
			System.out.println(s);
		//}
		
		
		
		
		
		
		
		
		
		/*Student s1= new Student();
		s1.id=101;
		s1.name="Riya";
		s1.dept="Civil";
		s1.marks=70;
		s1.display();//id,name,dept,marks
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id: ");
		id= sc.nextInt();
		System.out.println("Enter the name: ");
		name= sc.next();
		System.out.println("Enter the dept: ");
		dept= sc.next();
		System.out.println("Enter the marks: ");
		m= sc.nextInt();
		
		Student s2= new Student();
		s2.setData(id, name, dept, m);
		
		System.out.println("Enter the id: ");
		id= sc.nextInt();
		System.out.println("Enter the name: ");
		name= sc.next();
		System.out.println("Enter the dept: ");
		dept= sc.next();
		System.out.println("Enter the marks: ");
		m= sc.nextInt();
		
		Student s3= new Student();
		s2.setData(id, name, dept, m);
		
		
		
		s1.display();
		s2.display();
		s3.display();
*/
	}

}
