package inheritance;

public class Engine {
	
	private int power,torque;
	private String company;
	
	public void setPower(int power)
	{
		this.power=power;
	}
	
	public int getPower()
	{
		return power;
	}

	public int getTorque() {
		return torque;
	}

	public void setTorque(int torque) {
		this.torque = torque;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	/*Engine(int power,int torque,String company) //
	{
		this.power=power;
		this.torque=torque;
		this.company=company;
	}
	
	public String toString()
	{
		return "Power: "+power+"watt\nTorque: "+torque+"nm \nCompany: "+company;
	}*/

}
