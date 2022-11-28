package inheritance;

public class CarEngineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Engine e1= new Engine();
		e1.setPower(1000);
		e1.setTorque(6);
		e1.setCompany("Tata");
		
		
		Car c1= new Car();
		c1.setId(1001);
		c1.setName("Zest");
		c1.setCname("Tata");
		c1.setPrice(700000);
		c1.setEng(e1);
		
		System.out.println(c1.getName()+" "+c1.getPrice()+" "+c1.getCname());
		System.out.println("\nEngine Details: ");
		System.out.println("Engine Company: "+c1.getEng().getCompany());
		System.out.println("Power: "+c1.getEng().getPower()+"watt");
		System.out.println("Torque: "+c1.getEng().getTorque()+"lb");
		
		
		
		
		
		/*Engine e1= new Engine(1000,6,"Tata");
		Car c1= new Car(1001,"Zest","Tata",700000,e1);
		
		System.out.println(c1.hashCode());*/
		
		
		
		//System.out.println(c1);
		

	}

}
