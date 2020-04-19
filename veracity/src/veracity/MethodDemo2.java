package veracity;

public class MethodDemo2 {
	public static void add(int m, int n) {
		int s = m + n;
		System.out.println(s);
	}

	public static void main(String[] args) {
		System.out.println("main method");
		add(10, 20);

	}

}
