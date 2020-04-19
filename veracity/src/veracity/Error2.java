package veracity;

public class Error2 {

	public static void main(String[] args) {
		//static int n=10; // Here we will get errors because we cannot declare local variables as static
		int n=10;
		System.out.println(n);

	}

}


// Note:

//We cannot declare local variable as static because generally we declare a variable as static when that variable is common to all objects and need to access throughout the class.
//But local variables are not available outside the method so there is no sense of declaring local variables as static.
