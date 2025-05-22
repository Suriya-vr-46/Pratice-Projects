package User;
import java.util.*;

public class User {
	String name;
	Address add;
	
	
	public User(String name) {
		this.name = name;
	}
	
	class Address{
		String address;
		int pincode;
		
		public Address(String add,int pin) {
			this.address = add;
			this.pincode = pin;
		}
		
		public String getAddress() {
			return address;
		}
		
		public int getPincode() {
			return pincode;
		}
	}
	
	public void add_address(String add,int pin) {
		Address a = new Address(add,pin);
		this.add = a;
	}
	
	public String Address_validation() throws Invalid_Address{
		
		if(String.valueOf(add.getPincode()).length() != 6) {
			throw new Invalid_Address("InValid Pincode!");
		}
		return "valid Pincode";
	}
	
	public void user_info() {
		System.out.println("Name : "+name);
		System.out.println("Address : "+add.getAddress());
		System.out.println("Pincode : "+add.getPincode());
	}
}
