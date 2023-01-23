package inheritance;

public class A2 {
	A2() {
		System.out.println(1);
	}
	A2(int a) {
		this();
		System.out.println(2);
	}
	A2(int a,int b) {
		this(1);
		System.out.println(3);
	}
	{
		System.out.println("NSB-1");
	}
	{
	System.out.println("NSB-2");
	}
	public static void main(String[] args) {
		A2 a=new A2(12,10);
	}
}
