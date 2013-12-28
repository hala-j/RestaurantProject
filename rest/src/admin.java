package resturant;
import java.io.BufferedReader;
import java.util.Scanner;
import java.util.StringTokenizer;
public class admin {
	AvailableDishes dish;
	Customer customer;
	Order order;
	String password;
	Supply supply;
	private list NamesOfCustomers;
	String userName;
public void addCustomer(Customer customer){
	/*BufferedReader enteredinfo = new BufferedReader(new  InputStreamReader(system.in);
	private String infoOfCustomer;
	infoOfCustomer=enteredinfo.readLine();
	StringTokenizer   tokenizedLine = new  StringTokenizer(infoOfCustomer);
	while(tokenizedLine.hasMoreTokens()){
    String Name = tokenizedLine.nextToken();
    String Address1 =  tokenizedLine.nextToken();
    String Address2 =  tokenizedLine.nextToken();
    String telephoneNum1 =  tokenizedLine.nextToken();
    String telephoneNum2 =  tokenizedLine.nextToken();
    */
	String CustomerName=customer.getName();
	Adress[] CustomerAddresses=customer.getAddresses();
	int CustomerId=customer.getId();
	Phone CustomerPhone=customer.getPhone();
	String CustomerRating=customer.getRating();
	String CustomerState=customer.getState();
	
	}
public void addsupply(Supply supply){
	
	int amountInStorage=supply.getQuantity();
	BufferedReader supplyBuff = new BufferedReader(new  InputStreamReader(system.in);
	BufferedReader supplyQuantity = new BufferedReader(new  InputStreamReader(system.in);
	double newsupply=ParseDouble(supplyBuff.readLine());
	double Quantity=ParseDouble(supplyQuantity.readLine());
	if(checkResours(supply))
	supply.increase(newsupply);
	supply.setQuantity(Quantity);
}
public void deletesupply(Supply supply){
	
	int amountInStorage=supply.getQuantity();
	BufferedReader supplyBuff = new BufferedReader(new  InputStreamReader(system.in);
	BufferedReader supplyQuantity = new BufferedReader(new  InputStreamReader(system.in);
	double newsupply=ParseDouble(supplyBuff.readLine());
	double Quantity=ParseDouble(supplyQuantity.readLine());
	if (checkResours(supply))
	supply.decrease(newsupply);
	supply.setQuantity(Quantity);
}
public boolean checkResours(Supply supply)
{
	
}
