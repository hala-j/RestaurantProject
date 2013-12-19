
public class Main {
	
	public static void main(String args[])
	{
		ComplexNumber CN1 = new ComplexNumber();
		ComplexNumber CN2 = new ComplexNumber(3);
		ComplexNumber CN3 = new ComplexNumber(6,-9);
		
		System.out.println("CN1 :" + CN1) ;
		System.out.println("CN2 :" + CN2) ;
		System.out.println("CN3 :" + CN3) ;
		
		System.out.println("CN2 + CN3 = " + CN2.add(CN3));
		System.out.println("CN2 * CN3 = " + CN2.Mult(CN3));
		System.out.println("CN2 + CN1 = " + CN2.add(CN1));
		
	}

}
