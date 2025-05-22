package Student;
import java.util.*;

public class Course {
	String name;
	List<Student> Students;
	
	class Student{
		int id;
		String name;
		int grade;
		
		public Student(int id, String name, int grade){
			this.id = id;
			this.name = name;
			this.grade = grade;
		}
		
		public void display() {
			System.out.println("Id\t:  "+id);
			System.out.println("Name\t:  "+name);
			System.out.println("Grad\t:  "+grade);
		}
		
		public String getName() {
			return name;
		}
		
		public int getGrade() {
			return grade;
		}
	}
	
	public Course(String name) {
		this.name = name;
		this.Students = new ArrayList<>();
	}
	
	public void addStudent(int id, String name, int grade) {
		Student s = new Student(id,name,grade);
		Students.add(s);
	}
	
	public void getStudents() {
		System.out.println("From "+name+" Course!");
		Students.sort(Comparator.comparing(Student::getName));
		for(Student s : Students) {
			s.display();
		}
	}
	
	public void getGrade() {
		System.out.println();
		System.out.println("From "+name+" Course!");
		Students.sort(Comparator.comparing(Student::getGrade).reversed());
		for(Student s : Students) {
			s.display();
		}
	}
	
	public Student getMaxGrade() {
		int t=0;
		for(Student s: Students) {
			if(s.getGrade()>t) {
				t = s.getGrade();
			}
		}
		
		for(Student s: Students) {
			if(s.getGrade()==t) {
				return s;
			}
		}
		return null;
	}
	
	public void getFailers() {
		for(Student s: Students) {
			if(s.getGrade()<60) {
				s.display();
			}
		}
	}
	
	public void getStudent(String name) {
		boolean seen = false;
		for(Student s: Students) {
			if(s.getName().equals(name)) {
				s.display();
				seen = true;
			}
		}
		if(seen == false) {
			System.out.println(name+" Doesn`t Exists!");
		}
	}
}
