package encapsulation;

public class Employee {
	
	private int id,salary;
	private String name,dept,email;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	
	public String getDept()
	{
		return dept;
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee();
		System.out.println(e1.id);
		System.out.println(e1.name);

	}
*/
}
