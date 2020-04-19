package veracity;

public class Student {
	int rollNo;
	String name;

	public static void main(String[] args) {
		Student s = new Student(); // Storing first student info
		s.rollNo = 101;
		s.name = "Sujeet";

		Student s1 = new Student(); // Storing second student info
		s1.rollNo = 102;
		s1.name = "Chaudhary";

		// Retrieving data
		System.out.println("Roll No. of " + s.name + " is" + " " + s.rollNo);
		System.out.println("Roll No. of " + s1.name + " is" + " " + s1.rollNo);

	}

}
