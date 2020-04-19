package veracity;

//The variable declared at class level and without static keyword is called as non static variable.

//Non Static variable gets memory on object creation. When we create an object of a class , JVM allocates memory for it’s non static variables.
//
//To access non static variables we require an object. Without objects, non static variables can not exist.

public class NonStaticVariable {
	int a;
	int b;
	int c;

	public static void main(String[] args) {
		NonStaticVariable n = new NonStaticVariable();
		n.a = 10;
		n.b = 20;
		n.c = 30;
		System.out.println(n.a + " " + n.b + " " + n.c);

		NonStaticVariable n1 = new NonStaticVariable();
		n1.a = 100;
		n1.b = 200;
		n1.c = 300;
		System.out.println(n1.a + " " + n1.b + " " + n1.c);

		NonStaticVariable n2 = new NonStaticVariable();
		n2.a = 1;
		n2.b = 2;
		n2.c = 3;
		System.out.println(n2.a + " " + n2.b + " " + n2.c);

	}

}

//Lifetime of non-static variables is from object creation to object destruction.
//Scope is object scope i.e wherever we can access object there we can access non-static variable.
