package veracity;

public class NonVoidDemo {

	public static float m1() {
		return 10.5f;
	}

	public static void main(String[] args) {

		m1(); // method will execute but returned value cannot be used further in the program

		float f = m1();
		float x = 10 + m1();

		System.out.println(m1()); // method will execute and returned value will be printed but
									// cannot be used further in the program
		System.out.println(x);
		System.out.println(f);

	}

}
