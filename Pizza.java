import java.util.*;

public class Pizza 
{
	private String crust;
	private String type;
	private String size;
	private ArrayList<String> toppings;
	private double price;
	
	Pizza()
	{
		crust = "regular";
		type = "cheese";
		size = "medium";
		toppings.add("none");
	}
	
	Pizza(String crust, String type, String size) //price & toppings not included because they can vary LOTS
	{
		this.crust = crust;
		this.type = type;
		this.size = size;
	}
	
	//Mutators
	public void setCrust(String crust)
	{
		this.crust = crust;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public void setSize(String size)
	{
		this.size = size;
	}
	public void addTopping(String topping)
	{
		this.toppings.add(topping);
	}
	public void editPrice(double val)
	{
		this.price += val;
	}
	
	//Accessors
	public String getCrust()
	{
		return this.crust;
	}
	public String getType()
	{
		return this.type;
	}
	public String getSize()
	{
		return this.size;
	}
	
	//TODO retrieve Toppings
	
	public double getPrice()
	{
		return this.price;
	}

}
