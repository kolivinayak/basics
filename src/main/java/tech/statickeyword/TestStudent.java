package tech.statickeyword;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s1 = new Student(101, "ABC");
		
		Student s2 = new Student(102, "CDE");
		
		Student.updateClgName("VTS");
		s1.display();
		s2.display();
		TestStudent.main(2); // we can over load main method this is tricky interview question for interviews
	}
	
	public static void main(int a) {
		
		System.out.println("Overloaded method with argument " + a);
		
	}
	
	

}
