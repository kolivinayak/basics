package tech.exphandling;

public class Student {

	String name = "vinayak";
	int rollNo = 23;

	void validateMarks(int marks) throws MarksOutOfBondException {

		if (marks > 100)
			throw new MarksOutOfBondException("invalid marks");
		else
			System.out.println("Marks are valid  " + marks);
	}
}
