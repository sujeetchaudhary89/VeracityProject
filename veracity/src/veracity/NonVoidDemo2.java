package veracity;

public class NonVoidDemo2 {

	int a = 10;

	public static void m1(NonVoidDemo2 t1) {
		System.out.println(t1.a);
		t1.a = 200;
	}

	public static void main(String[] args) {

		NonVoidDemo2 t = new NonVoidDemo2();
		System.out.println(t.a);
		m1(t);
		System.out.println(t.a);

	}

}
