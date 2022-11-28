package encapsulation;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee();
		//System.out.println(e1.id);
		//System.out.println(e1.name);
		
		e1.setId(101);
		e1.setName("Raj");
		e1.setDept("HR");
		
		
		Employee e2= new Employee();
		e2.setId(102);
		e2.setName("Riya");
		e2.setDept("Administrataion");
		
		System.out.println(e1.getName()+" "+e1.getDept());
		System.out.println(e2.getName()+" "+e2.getDept());
		
		
		e1.setDept("Finance");
		System.out.println(e1.getName()+" "+e1.getDept());
		
		
	}

}
