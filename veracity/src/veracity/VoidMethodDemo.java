package veracity;

public class VoidMethodDemo {
	
	int a = 10;
    public static void m1(){
            System.out.println("m1 method");
    }


	public static void main(String[] args) {
		//int x = m1();  //wrong way 
        //int y = 10 + m1(); //wrong way
       // System.out.println(m1()); //wrong way
        m1();//statement 1


	}

}
