class BBB {
	BBB(int marker) {
		System.out.println("BBB(" + marker + ")");
	}

	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class aaa {
	static BBB b1 = new BBB(1);

	aaa() {
		System.out.println("aaa()");
		b2.f(1);
	}

	void f2(int marker) {
		System.out.println("f2(" + marker + ")");
	}

	static BBB b2 = new BBB(2);
}

class ccc {
	BBB b3 = new BBB(3);
	static BBB b4 = new BBB(4);

	ccc() {
		System.out.println("ccc()");
		b4.f(2);
	}

	void f3(int marker) {
		System.out.println("f3(" + marker + ")");
	}

	static BBB b5 = new BBB(5);
}

class A {
	public A() {
		System.out.println("AA");
	}

	int x = 3;
	static int y = 4;
}

class B extends A {

	public B(int x) {
		System.out.println("BB2");
	}

	public B() {
		System.out.println("BB1");
	}

	int x = 2;

	protected void d() {
		System.out.println("father");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}

class C extends B {
	// int x = 2;

	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public String sss;

	public C() {
		System.out.println("CC");
	}

	public void ff() {

		Day day = Day.SUNDAY;
		sss = day.name();

	}

	public void d() {
		System.out.println("son");
	}
}

public class Test {
	public static void main(String[] args) {

		/*
		 * C c1 = new C(); c1.d(); c1.ff(); System.out.println(c1.sss);
		 */
		/*double ACC = 0.0;
		for (int i = 0; i < 9; i++)
			ACC += (double) 1 / 9;

		System.out.println(ACC);*/
		double AC = 0.0;
		   for (int i = 0 ; i<9 ; i++)
		   AC = /*1.0/9.0;*/ (1.0/3.0)+(1.0/3.0);
		   System.out.printf("\nac = %f",AC);
		   System.out.println("\n"+AC);
		   system.out.println("end");
		/*Double ACC = 0.0;
		   for (int i = 0 ; i <= 9 ; i++)
		      	ACC = ACC +  (1%9);

		   System.out.printf("the acc value : %f " , ACC/10);
*/
		/*
		 * System.out.println("----"); B b1 = new B();
		 * System.out.println("----"); A a1 = new A();
		 */

		/*
		 * c1.d(); b1.y++; c1.y++; System.out.println(c1 instanceof C); // true
		 * System.out.println(c1 instanceof B); // true System.out.println(c1
		 * instanceof A); // true
		 * 
		 * doStuff(c1); System.out.println(b1.y + " " + c1.y);
		 */

		// System.out.println("hello world\nhello me");
		// double commission = Double.parseDouble(
		// JOptionPane.showInputDialog(null,"enter a number : "));//enter string
		// JOptionPane.showMessageDialog(null,"x= " , "output",
		// JOptionPane.INFORMATION_MESSAGE);

		// about aaa bbb ccc
		/*
		 * System.out.println("Creating new ccc() in main"); BBB n = new BBB(1);
		 */

	}

	public static void doStuff(B bb) {
		bb.d();
	}
	/*
	 * static aaa t2 = new aaa(); ccc t3 = new ccc();
	 */

}
