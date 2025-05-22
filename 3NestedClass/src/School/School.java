package School;
import java.util.*;

public class School {
	int counter=0;
	String name;
	List<Student> students;
	
	class Student{
		String name;
		int rollno;
		
		public Student(int rollno, String name) {
			this.name = name;
			this.rollno = rollno;
			counter++;
		}
		
		public void display() {
			System.out.println("Name : "+name);
			System.out.println("Rollno : "+rollno);
		}
		
	}
	
	public School(String name) {
		this.name = name;
		this.students = new ArrayList<>();
	}
	
	public void add_student(int rollno, String name) {
		Student s = new Student(rollno, name);
		students.add(s);
	}
	
	public void getCount() {
		System.out.println("Counter : "+counter);
	}
	
	public void display_students() {
		System.out.println("From School : "+name+"!");
		for(Student s: students) {
			s.display();
		}
	}
}
