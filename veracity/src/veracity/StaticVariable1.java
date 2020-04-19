package veracity;

public class StaticVariable1 {
	static int a = 10;

	public static void main(String args[]) {
		System.out.println(a);
		System.out.println(b);
		m1();
	}

	public static void m1(){
		System.out.println(a);
		System.out.println(b);
	}
	static int b = 20;

}
