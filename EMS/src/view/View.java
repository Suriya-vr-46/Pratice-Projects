package view;
import model.Employee;
import model.Department;
import database.ViewMethods;
import java.util.*;

public class View implements ViewMethods{
	static Scanner in = new Scanner(System.in);
	
	@Override
	public int showMenu() {
		System.err.println("Employee Management System!");
		System.out.println("1.Enter Department detials.\n2.Enter Employee detials.\n3.Show Employees.\n4.Show Departments.\n5.Exit.");
		System.out.println("Enter your Choice : ");
		return in.nextInt();
	}
	
	@Override
	public void newDepartment() {
		System.out.println("Enter the Department ID : ");
		int id = in.nextInt();
		in.nextLine();
		System.out.println("Enter the Department Name : ");
		String name = in.nextLine();
		Department dep = new Department(id,name);
		deps.add(dep);
	}
	
	@Override
	public void newEmployee() {
		System.out.println("Enter the Employee ID : ");
		int id = in.nextInt();
		in.nextLine();
		System.out.println("Enter the Employee Name : ");
		String name = in.nextLine();
		System.out.println("Enter the Department ID : ");
		int departmentId = in.nextInt();
		boolean found = false;
		for(Department dep: deps) {
			if(dep.getId() == departmentId) {
				found = true;
			}
		}
		if(!found) {
			System.out.println("Department Id is not exists!");
			System.out.println("Please try again!");
		}else {
			emps.add(new Employee(id,name,departmentId));
		}
	}
	
	@Override
	public void showEmployees() {
		System.err.println("Employee Detials!");
		if(emps.size()==0) {
			System.out.println("No Employees!");
			return;
		}
		for(Employee emp: emps) {
			System.out.println("ID\t\t\t: "+emp.getId());
			System.out.println("Name\t\t: "+emp.getName());
			System.out.print("Department\t: ");
			for(Department dep: deps) {
				if(dep.getId()==emp.getDepartmentId()) {					
					System.out.println(dep.getName());
				}
			}
			System.out.println();
		}
	}
	
	@Override
	public void showDepartments() {
		System.err.println("Department Detials!");
		if(deps.size()==0) {
			System.out.println("No Departments!");
			return;
		}
		for(Department dep: deps) {
			System.out.println("ID\t\t: "+dep.getId());
			System.out.println("Name\t: "+dep.getName());	
		}
	}
}
