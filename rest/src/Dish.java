import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
public class Dish extends OrderItem
{
	private HashMap<Supply, Double> ingredient ;
	
	public Dish()
	{
		super();
		ingredient = new HashMap<Supply,Double>();	
	}
	
	public void addIngredient(Supply s , Double qunatity)
	{
		ingredient.put(s, qunatity);
	}
	
	public void modifiyQuantity(Supply s , Double d) throws NoSuchAlgorithmException
	{
		if(ingredient.containsKey(s))
			ingredient.put(s,d);
		else
			throw new NoSuchAlgorithmException("Supply not found !");
	}
	
	public void delete(Supply s )
	{
		ingredient.remove(s);
	}
	
	public void deleteAll()
	{
		ingredient.clear();
	}
	
	public boolean search(Supply s)
	{
		if (ingredient.containsKey(s))
			return true ;
		else 
			return false ;
	}
	
//	private List<Supply> ingredient ;
//	private List<Double> quantity ;
//	
//	public Dish()
//	{
//		super();
//		List< Supply > ingredient = new ArrayList< Supply >();
//		List< Double > quantity = new ArrayList< Double >();	
//	}
//	
//	public void showIngredient(List<Supply> i)
//	{
//		System.out.printf("%s . This Dish contains : \n",this.getItemName());
//		for(Supply elem : i)
//		{
//			System.out.println(elem);
//		}
//	}
//	
//	public void addIngredients(Supply ing[])
//	{
//		for(Supply elem : ing)
//		{
//			ingredient.add(elem);
//		}
//	}
//	
//	public void addOneIngredient(Supply ing)
//	{
//		ingredient.add(ing);
//		
//	}
//	
//	public boolean search(Supply s)
//	{
//		if(ingredient.contains(s))
//			return true ;
//		else
//			return false ;
//	}
//	
//	public void delete(Supply s)
//	{
//		ingredient.remove(s);
//	}
//	
	
	
	
	
}
