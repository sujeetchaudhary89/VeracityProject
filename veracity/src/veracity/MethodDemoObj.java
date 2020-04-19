package veracity;

public class MethodDemoObj {
	int a=10;
	public static void m1(MethodDemoObj d1) {
		System.out.println(d1.a);
		d1.a=100;
	}

	public static void main(String[] args) {
		MethodDemoObj d = new MethodDemoObj();
		System.out.println(d.a);
		m1(d);
		System.out.println(d.a);
		

	}

}
