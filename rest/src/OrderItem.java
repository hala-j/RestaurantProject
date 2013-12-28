
public class OrderItem 
{
	private String itemName;
	private int ID;
	private double cost;
	

	public OrderItem(String name , int id , double c)
	{
		setItemName(name);
		setID(id);
		setcost(c);
	}
	
	public OrderItem()
	{
		this("",0,0);
	}
	
	public void setItemName(String itemName)
	{
		this.itemName = itemName ;
	}
 
	public String getItemName()
	{
		return itemName;
	}
	
	public void setID(int i)
	{
		if (i >= 0)
			ID =  i ;
		else
			throw new IllegalArgumentException("Id must be >= 0 !");
	}
 
	public int getID()
	{
		return ID;
	}
	
	public void setcost(double s)
	{
		if (s >= 0)
			cost =  s ;
		else
			throw new IllegalArgumentException("cost  must be >= 0 !");
	 
	}
 
	public double getcost()
	{
		return cost;
	}
}