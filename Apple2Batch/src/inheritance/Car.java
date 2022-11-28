package inheritance;

public class Car {
	
	private int id,price;
	private String name,cname;
	private Engine eng;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public void setEng(Engine eng)
	{
		this.eng=eng;
	}
	
	public Engine getEng()
	{
		return eng;
	}
	
	/*Car(int id,String name,String cname,int price,Engine e)
	{
		this.id=id;
		this.name=name;
		this.cname=cname;
		this.price=price;
		this.e=e;
	}
	
	public String toString()
	{
		return name+" "+cname+" "+price+"\nEngine Details:\n"+e;
	}
*/
}
