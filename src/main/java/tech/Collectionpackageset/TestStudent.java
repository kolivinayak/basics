package tech.Collectionpackageset;


import java.util.Iterator;
import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(101, 99, "ABC");
		Student s2 = new Student(102, 50, "DEF");
		Student s3 = new Student(103, 85, "GHI");
		Student s4 = new Student(104, 76, "JKL");
		
		TreeSet<Student> ss = new TreeSet<Student>();
		
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		
		Iterator<Student> itr =ss.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
