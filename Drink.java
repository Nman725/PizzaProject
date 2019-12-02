
public class Drink 
{
	private String type;
	private String size;
	private double price;
	
	public Drink()
	{
		
	}
	
	public Drink(String type, String size)
	{
		this.type = type;
		this.size = size;
	}
	
	//Mutators
	public void setType(String type)
	{
		this.type = type;
	}
	public void setSize(String size)
	{
		this.size = size;
	}
	public void editPrice(double val)
	{
		this.price += val;
	}
}
