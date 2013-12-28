
public class Entertainment extends OrderItem
{
	private static int  COUNT ; 
	
	
	public Entertainment()
	{
		super();
		increment();
	}
	
	public void set(int c) {
		
		COUNT = c ;
		
	}
	public int get()
	{
		return COUNT ; 
	}
	
	public void increment()
	{
		COUNT++ ;
	}
	
	public void decrement()
	{
		COUNT-- ;
	}
	

	
}
