package veracity;

//If we want to store student name and college name then we have to create class as given below:

//public class Student1 {
//	String student_name;
//	String college_name;
//	
//	public static void main(String[] args) {
//		Student1 s = new Student1();
//		s.student_name = "Ram";
//		s.college_name = "CITE";
//		
//		Student1 s1 = new Student1();
//		s1.student_name = "Hari";
//		s1.college_name = "CITE";
//		
//		System.out.println(s.student_name+" "+s.college_name);
//		System.out.println(s1.student_name+" "+s1.college_name);
//
//	}
//
//}

// Here in above example college_name property is common for all objects so declare this property as static as given below:

public class Student1 {
	String student_name;
	static String college_name="CITE";
	
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.student_name = "Ram";
		
		Student1 s1 = new Student1();
		s1.student_name = "Hari";
		
		System.out.println(s.student_name+" "+s.college_name);
		System.out.println(s1.student_name+" "+s1.college_name);

	}

}