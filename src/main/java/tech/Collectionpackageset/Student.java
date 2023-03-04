package tech.Collectionpackageset;

public class Student implements Comparable <Student> {

	int rollno;
	int marks;
	String name;
	
	
	public Student(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}


	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		if (this.marks < o.marks)
		return 1;
		else if (this.marks > o.marks)
			return -1;
		else
			return 0;
	}


	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	
	
}
