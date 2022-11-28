
public class Employee {

	int id,salary;
	String name,dept;
	
	Employee(int id,String name,int salary,String dept)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	
	public String toString()
	{
		return id+" "+name+" "+salary+" "+dept;
				
	}
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	*/
}
