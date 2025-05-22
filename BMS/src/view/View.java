package view;
import model.Bank;
import model.User;
import database.ViewMethods;
import uitility.InvalidInput;
import java.util.*;

public class View implements ViewMethods {
	static Scanner in = new Scanner(System.in);
	
	@Override
	public int showMenu() {
		System.err.println("Bank Management System!");
		System.out.println("1.Enter Bank Detials.\n2.Enter User Detials.\n3.Exit");
		System.out.println("Enter your Choice : ");
		int c = in.nextInt();
		return c;
	}
	
	@Override
	public void newBank() {
		System.err.println("Bank Detials!");
		System.out.println("Enter Bank Name : ");
		String name = null;
		try {
			name = validInput(in.nextLine());
		}catch(InvalidInput e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Enter Bank branch code : ");
		long bcode = in.nextLong();
		
		banks.add(new Bank(name,bcode));
	}
	
	@Override
	public void userMenu() {
		System.err.println("User Menu!");
		System.out.println("1.Sign in.\n2.Sign up.\n3.Exist");
		int c = in.nextInt();
		
		switch(c) {
			case 1 -> existingUser();
			case 2 -> newUser();
			case 3 -> System.out.println("Thank you!");
			default -> System.err.println("Invalid Choice!");
		}
	}
	
	@Override
	public void newUser() {
		System.err.println("New User!");
		System.out.println("Enter Bank Name : ");
		String bname = null;
		try {
			bname = validInput(in.nextLine());
		}catch(InvalidInput e) {
			System.err.println(e.getMessage());
		}
		boolean found = false;
		for(Bank bank: banks) {
			if(bank.getName().equalsIgnoreCase(bname)) {
				found = true;
			}
		}
		if(!found) {
			System.err.println(bname+" is not a Exists!");
			System.out.println("Please try again!");
			System.out.println();
			return;
		}
		
		System.out.println("Enter User Name : ");
		String name = null;
		try {
			name = validInput(in.nextLine());
		}catch(InvalidInput e) {
			System.err.println(e.getMessage());
		}
	
		System.out.println("Set your password : ");
		String password = null;
		try {
			password = validInput(in.nextLine());
		}catch(InvalidInput e) {
			System.err.println(e.getMessage());
		}
		
		Random rand = new Random();
		int id = rand.nextInt(9999) + 1000;
		long accountNo = rand.nextLong(9999999999L) + 10000000000L;		
		Thread t = new Thread(() -> {
			System.out.println();
			System.err.println("New Account is Creating!");
			try {
				Thread.sleep(2000);
				System.out.println();
				System.err.println("Account Created Sucessfully!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Account Detials!");
		System.out.println("User Name\t: "+name);
		System.out.println("Password\t: ");
		for(int i=0;i<password.length()-2;i++) {
			System.out.print("*");
		}
		System.out.print(password.charAt(password.length()-2)+""+password.charAt(password.length()-1));
		System.out.println();
		System.out.println("Account Number\t: "+accountNo);
		System.out.println();
		users.add(new User(id,name,accountNo,password));
	}
	
	public void existingUser{
		System.err.println("Existing User!");
		System.out.println("Enter User Name : ");
		String bname = null;
		try {
			bname = validInput(in.nextLine());
		}catch(InvalidInput e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static String validInput(String name) throws  InvalidInput{
		if(name.isBlank() || name.isEmpty()) {
			throw new InvalidInput(name+" is not a valid Input!");			
		}else {
			return name;
		}
	}
}