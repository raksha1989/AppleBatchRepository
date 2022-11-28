package classesandobjects;

import java.util.Scanner;

public class Car {
	
	int id,price;
	String name,company;
	
	Car()  //classname()  simple constructor
	{
		id=-1;
		price=-1;
		name="nnnn";
		company="cccc";
	}
	
	Car(int id,String name, String company,int price)
	{
		this.id=id;
		this.name=name;
		this.company=company;
		this.price=price;
	}
	
	
	/*Car(int id,String name, String company)
	{
		this.id=id;
		this.name=name;
		this.company=company;
	}*/
	void show()
	{
		int a=0,b=0;
		System.out.println(a+" "+b);
		System.out.println(id+" "+name);
	}
	public String toString()
	{
		return id+" "+name+" "+company+" "+price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Car c1= new Car();//Car c1= new Constructor;
		Car c2= new Car();*/
		int id,price;
		String name,company;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id: ");
		id=sc.nextInt();
		Car c1= new Car(id,"Baleno","Maruti",700000);
		
		System.out.println("Enter the id: ");
		id=sc.nextInt();
		Car c2= new Car(id,"Swift","Maruti",600000);
		
		System.out.println(c1);
		System.out.println(c2);

	}

}
