import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class EmployeeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm= new HashMap<>();
		
		hm.put(1, "a");
		hm.put(12, "b");
		hm.put(3, "c");
		hm.put(4, "d");
		hm.put(5, "e");
		hm.put(6, "f");
		
		
		/*for(Integer i:hm.keySet())
		{
			System.out.println(i+" "+hm.get(i));
		}
		
		for(String s:hm.values())
		{
			System.out.println(s);
		}
		*/
		
		/*for(Map.Entry<Integer, String> entry: hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}*/
		
		Iterator<Map.Entry<Integer, String>> itr= hm.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		/*
		ArrayList<Employee> al= new ArrayList<>();
		
		al.add(new Employee(101,"Raj",70000,"HR"));
		al.add(new Employee(102,"Ramesh",60000,"HR"));
		al.add(new Employee(103,"Ajay",50000,"HR"));
		al.add(new Employee(104,"Kajal",65000,"HR"));
		al.add(new Employee(105,"Riya",75000,"HR"));
		
		//updae salalry of employee id=103
		
		ListIterator<Employee> itr= al.listIterator();
		System.out.println(al);
		
		while(itr.hasNext())
		{
			Employee e= itr.next();
			if(e.id==103)
			{
				//itr.set(new Employee(e.id,e.name,65000,e.dept));
				//e.salary=65000;
				itr.remove();
			}
		}
		
		System.out.println(al);
*/
	}

}
