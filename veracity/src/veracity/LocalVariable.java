package veracity;

public class LocalVariable {

	public static void m1() {
		int m = 20;
		System.out.println(m);
		//System.out.println(n);
	}

	public static void main(String[] args) {
		int n = 10;
		m1();
		System.out.println(n);
		//System.out.println(m);

	}

}

//Here m is local variable of m1() and 
//n is the local variable of main() so they can be accessed within the same method.
//
//At line number 8 we will get error because n is local variable of main()
//And we cannot access outside the main().
//
//Similarly at line 15 we will get error because m is local variable of m1()
//Cannot access in main().

