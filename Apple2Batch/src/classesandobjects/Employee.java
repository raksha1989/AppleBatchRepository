package classesandobjects;

public class Employee {
	
	float hike(float salary,char rating)
	{
		float hike=0,newSal=0;
		System.out.println("Salary: "+salary);
		
		if(rating=='A')
		{
			hike=salary*0.2f;
			newSal=salary+hike;
		}
		else if(rating=='B')
		{
			hike=salary*0.15f;
			newSal=salary+hike;
		}
		else if(rating=='C')
		{
			hike=salary*0.1f;
			newSal=salary+hike;
			//System.out.println(newSal);
		}
		else
		{
			System.out.println("Sorry..Poor rating no increment...!!!");
		}
		
		System.out.println("Hike %: "+hike);
		System.out.println("Hiked Salary: "+newSal);
		return newSal;
	}
	
	void pfcalculate(float salary)
	{
		float pf=salary*0.15f;
		//System.out.println("Salary: "+salary);
		System.out.println("PF: "+pf);
		//System.out.println("New Salary: "+(salary-pf));
		bonus(salary);
	}
	
	void bonus(float salary)
	{
		float ebonus=salary*0.25f;
		System.out.println("Bonus is: "+ebonus);
	}

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		 Employee p1= new Employee();
		 float newSalary=p1.hike(60000, 'A');//newSalary=55000  called
		 p1.pfcalculate(newSalary);
		 //p1.bonus(newSalary);
		 
		 System.out.println("-------*******-------");
		 Employee e2= new  Employee();
		 newSalary=e2.hike(80000, 'B');
		 e2.pfcalculate(newSalary);
	}

}
