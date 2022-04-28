package tech.exphandling;

public class TestCustomExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		try {
			s.validateMarks(900);
		} catch (MarksOutOfBondException e) {
			// e.printStackTrace();
			System.out.println("Exception message => " + e.getMessage());
		}
	}

}
