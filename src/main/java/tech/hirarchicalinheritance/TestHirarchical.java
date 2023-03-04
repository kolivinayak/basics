package tech.hirarchicalinheritance;

public class TestHirarchical {

	public static void main(String[] args) {
		
		Student s = new Student();
		
		Employee e = new Employee();

		s.input();
		s.input_student();
		s.show_student();
		
		e.input();
		e.input_employee();

		System.out.println();
		e.display_employee();

	}
}
