import java.util.*;

public class Customer
{
	private String name;
	private String phoneNum;
	private String bAddress;
	private String sAddress;
	private ArrayList<Order> orderHistory;
	
	Customer()
	{
		name = null;
		phoneNum = null;
		bAddress = null;
		sAddress = null;
		orderHistory = null;
	}
	
	Customer (String name, String phoneNum, String bAddress, String sAddress)
	{
		this.name = name;
		this.phoneNum = phoneNum;
		this.bAddress = bAddress;
		this.sAddress = sAddress;
	}
	
	//Mutators//
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCustPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}
	public void setCustBAddress(String bAddress)
	{
		this.bAddress = bAddress;
	}
	public void setCustSAddress(String sAddress)
	{
		this.sAddress = sAddress;
	}
	public void setOrderHistory(Order order)
	{
		orderHistory.add(order);
	}
	
	//Accessors//
	public String getName()
	{
		return this.name;
	}
	public String getPhoneNum()
	{
		return this.phoneNum;
	}
	public String getBAddress()
	{
		return this.bAddress;
	}
	public String getSAddress()
	{
		return this.sAddress;
	}
	
	//TODO retrieve Order History
	
	
}