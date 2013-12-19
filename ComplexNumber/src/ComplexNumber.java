
public class ComplexNumber {
	
	private Integer real ;
	private Integer img ;
	
	public ComplexNumber()
	{
		this(0 , 0) ; 
	}
	
	public ComplexNumber(int Real)
	{
		this(Real , 0) ; 
	}
	
	public ComplexNumber(int R , int I)
	{
		real = R; 
		img =  I ; 
	}
	
	public ComplexNumber add(ComplexNumber N)
	{
		ComplexNumber retval = new ComplexNumber() ; 
		retval.real = this.real + N.real ; 
		retval.img = this.img + N.img ; 
		
		return retval; 
	}
	
//	public ComplexNumber sub(ComplexNumber X)
//	{
//		return 0 ;
//	}
	
	public ComplexNumber Mult(ComplexNumber N)
	{
		ComplexNumber retval = new ComplexNumber() ; 
		retval.real = (this.real * N.real)  + (-1 * (this.img * N.img)); 
		retval.img =  (this.img * N.real) + (this.real * N.img); 
		
		return retval;
	}
	
	public String toString()
	{
		String s ;
		if (real == 0 && img == 0)
			s = "0";
		else if (img == 0 )
			s = real.toString()  ;
		else if(real == 0)
			s = img + "i" ;
			
		else 
		{
			if (img > 0)
				s = real +"+"+ img + "i " ;
			else 
				s = real +""+ img + "i " ;
			
		}
			
			
		return s; 
	}

}
