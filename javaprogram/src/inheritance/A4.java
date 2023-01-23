package inheritance;

public class A4 extends A3{
	A4() {
		this(12);
		System.out.println(2);
	}
	A4(int a) {
		System.out.println(4);
	}
	{
		System.out.println(5);
	}
	{
		System.out.println(6);
	}
	public static void main(String[] args) {
		A4 a1=new A4();
		
	}

}
