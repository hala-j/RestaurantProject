import java.util.*;


public class Date {
	
	private int day ; 
	private int month ; 
	private int year ;
	int m[] = {0,31,28,31,30,31,30,31,31,30,31} ;
	
	//constructor
	public Date(int y , int m , int d) 
	{
		SetYear(y);
		SetMonth(m);
		SetDay(d);
	}
	

	public void  SetYear(int y)
	{
		Calendar now = Calendar.getInstance()   ;
				 
				
		if (y >= 1995 &&  y <= now.get(Calendar.YEAR))
			year = y ; 
		else 
		{
			year = 0 ; 
			System.out.println("\nout of range");
		}
			
 	}//end set year
	
	
	public void SetMonth (int m)
	{
		if (m > 0 && m < 13)
			month = m ; 
		else 
		{
			month = 0 ; 
			System.out.println("invalid month");
		}
			
	}// end set month 
	
	
	public void SetDay (int d)
	{
	
		if (d < m[month])
			day = d ; 
		
		else
			
			if (d == 29 && month == 2)   //is it leap year ?
			{
				if (year % 1000 == 0 )
						day = d ; 
					
				else 
					if (year % 100 == 0 )
					{
							System.out.println("\nyear is not leap year!") ;
							day = 1 ;
					}
					else 
						if (year % 4 == 0 )
							day = d ;
					    else 
					    {
					    	System.out.println("\nyear is not leap year!") ;
					    	day = 28 ;
					    }
			}
	}// end set day
	
	public String ToString()
	{
		return String.format("date : %2d / %2d / %4d .", day,month,year) ;
	}

}// end class
