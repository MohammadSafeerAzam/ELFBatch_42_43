package inheritance;

public class A1 {
		A1() {
			this(1);
		System.out.println(1);
		}
		A1(int a) {
			this(1,1);
			System.out.println(2);
		}
		A1(int a,int b) {
			System.out.println(3);
		}
		{
			System.out.println("NSB-1");
		}
		{
			System.out.println("NSB-2");
		}
		public static void main(String[] args) {
		A1 a=new A1();
	}

}
