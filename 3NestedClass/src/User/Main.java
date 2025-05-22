package User;

public class Main {
	public static void main(String[] args) {
		User s = new User("Suriya");
		s.add_address("2/1 Cheran manager", 641035);
		s.user_info();
		try {
			System.out.println(s.Address_validation());
		}catch(Invalid_Address e) {
			System.err
			.println(e.getMessage());
		}
	}
}
