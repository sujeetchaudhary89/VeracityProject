package veracity;

//Static variable:
//The variable which is declared at class level with a static keyword called static variable.
//Static variable will get memory after class loading and before main method invocation.
//Static variables are available throughout the class and accessible to all objects of that class.
//
//Lifetime of static variables is from class loading to class unloading.
//Scope of static variable is throughout the class. 


public class StaticVariable {
	static int a=10;
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
	}
		static int b=20;
}
