package controller;
import view.View;
import model.Bank;
import model.User;
import java.util.*;

public class Controller {
	public void start() {
		View view = new View();
		boolean running = true;
		
		do {
			int c = view.showMenu();
			
			switch(c) {
				case 1 -> view.newBank();
				case 2 -> view.userMenu();
				case 3 -> System.out.println("Thank you!");
				default -> System.err.println("Invalid Choice!");
			}
		}while(running);
	}
}
