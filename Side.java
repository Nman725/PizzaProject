
public class Side 
{
	private String type;
	private double price;
	
	Side()
	{
		
	}
	
	Side(String type, double price)
	{
		this.type = type;
		this.price = price;
	}
	
	//Mutators
	public void setType(String type)
	{
		this.type = type;
	}
	public void editPrice(double val)
	{
		this.price += val;
	}
	
	//Accessors
	public String getType()
	{
		return this.type;
	}
	public double getPrice()
	{
		return this.price;
	}
}
