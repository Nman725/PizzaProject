import java.util.*;

public class Order
{
	private ArrayList<Pizza> pizzas;
	private ArrayList<Side> sides;
	private ArrayList<Drink> drinks;
	
	private String paymentMethod;
	private double total;
	private double orderNum;
	private boolean delivery = false;
	private String receipt;
	
	//Mutators//
	public void addPizza(Pizza p)
	{
		pizzas.add(p);
	}
	public void addSide(Side s)
	{
		sides.add(s);
	}
	public void addDrink(Drink d)
	{
		drinks.add(d);
	}
	public void setPaymentMethod(String pm)
	{
		this.paymentMethod = pm;
	}
	public void setDelivery(boolean b)
	{
		this.delivery = b;
	}
	public void editTotal(double val)
	
	{
		this.total += val;
	}
	//TODO mutators for orderNum & receipt
	//TODO accessors for Order class
}