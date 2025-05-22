package Student;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Course> m = new HashMap<>();
		
		while(true) {
			System.out.println("Student Management System!");
			System.out.println("1.Add Student");
			System.out.println("2.Show Students");
			System.out.println("3.Show Courses");
			System.out.println("4.Show Grades");
			System.out.println("5.Show Top Student");
			System.out.println("6.Show Failers");
			System.out.println("7.Search Student");
			System.out.println("8.Exit");
			System.out.print("Enter your Choice : ");
			int c = sc.nextInt();
			sc.nextLine();
			
			switch(c) {
				case 1:
					System.out.println("Enter the Course name : ");
					String course = sc.nextLine();
					
					if(!m.containsKey(course)) {
						m.put(course, new Course(course));
					}
					System.out.println("Enter Student Id : ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Student Name : ");
					String name = sc.nextLine();
					System.out.println("Enter Student Grade : ");
					int grade = sc.nextInt();
					sc.nextLine();
					m.get(course).addStudent(id, name, grade);
					System.out.println("Student Added!");
					System.out.println();
					break;
					
				case 2:
					System.out.println("Enter your Course Name : ");
					String cou = sc.nextLine();
					if(m.containsKey(cou)) {
						m.get(cou).getStudents();
					}else {
						System.out.println("Invalid Course Name!");
					}
					break;
					
				case 3:
					if(m.isEmpty()) {
						System.out.println("No Course Exists!");
					}else {
						for(String s: m.keySet()) {
							System.out.println(s);
						}
					}
					
				case 4:
					System.out.println("Enter your Course Name : ");
					String co = sc.nextLine();
					if(m.containsKey(co)) {
						m.get(co).getGrade();
					}else {
						System.out.println("Invalid Course Name!");
					}
					break;
					
				case 5:					
					System.out.println("Enter your Course Name : ");
					String tc = sc.nextLine();
					if(m.containsKey(tc)) {
						m.get(tc).getMaxGrade().display();
					}else {
						System.out.println("Invalid Course Name!");
					}
					break;
					
				case 6:
					System.out.println("Enter your Course Name : ");
					String fc = sc.nextLine();
					if(m.containsKey(fc)) {
						m.get(fc).getFailers();
					}else {
						System.out.println("Invalid Course Name!");
					}
					break;
					
				case 7:
					System.out.println("Enter your Course Name : ");
					String cw = sc.nextLine();
					System.out.println("Enter the Student Name : ");
					String sname  = sc.nextLine();
					
					if(m.containsKey(cw)) {
						m.get(cw).getStudent(sname);
					}
					break;
					
				case 8: 
					System.out.println("Thank you!");
					break;
				
				default: 
					System.out.println("Invalid Choice!");
			}
			
			if(c == 8) {
				break;
			}			
		}
		sc.close();
	}

}
