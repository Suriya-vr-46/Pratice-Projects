
package controller;
import view.View; 
import java.util.*;


public class Controller {
	static Scanner in = new Scanner(System.in);
	static View v = new View();
	
	public void start() {
		boolean running = true;
		int c = 0;
		do {
			c = v.showMenu();
			System.out.println();
			
			switch(c) {
				case 1:
					boolean gettingDepartment = true;
					while(gettingDepartment) {
						v.newDepartment();
						System.out.println("Do you want to add another department (y/n): ");
						String choice = in.next();
						if(choice.equalsIgnoreCase("n")) {
							gettingDepartment = false;
						}else if(!choice.equalsIgnoreCase("y")) {
							System.out.println("Invalid Choice");
						}
						System.out.println();
					}
					break;
										
				case 2:
					boolean gettingEmployee = true;
					while(gettingEmployee) {
						v.newEmployee(); 
						System.out.println("Do you want to add another employee (y/n): ");
						String choice = in.next();
						if(choice.equalsIgnoreCase("n")) {
							gettingEmployee = false;
						} else if(!choice.equalsIgnoreCase("y")) {
							System.out.println("Invalid Choice");
						}
						System.out.println();
					}
					break;
					
				case 3:
					v.showEmployees();
					System.out.println();
					break;
				
				case 4:
					v.showDepartments();
					System.out.println();
					break;
					
				case 5:
					running = false;
					System.err.println("Thank you!");
					break;
					
				default:
					System.out.println("Invalid choice!");
			}
		}while(running);
	}
}
