package classesandobjects;

public class Student2 {

	int id, marks;
	String name, dept; 

	void setData(int id, String name, String dept, int marks) 
	{
		this.id = id;   // current object in use  this->s      s.id=id;
		this.name = name;
		this.dept = dept;
		this.marks = marks;

	}

	public String toString() 
	{
		return id + " " + name + " " + dept + " " + marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 s = new Student2();
		//s.setData(101, "Raj", "Computer", 70);
		
		Student2 s1 = new Student2();
		s1.setData(102, "Kajal", "Computer", 65);
		
		Student2 s2 = new Student2();
		s2.setData(103, "Tina", "Computer", 60);

		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);

	}

}
