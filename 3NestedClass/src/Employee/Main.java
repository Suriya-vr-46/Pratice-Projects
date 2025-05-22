package Employee;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		HashMap<String,Department> ob = new HashMap<>();
		
		ob.put("Hr", new Department("HR"));
		ob.put("Sales", new Department("Sales"));
		
		ob.get("Hr").add_employee(01, "Suriya", 15000);
		ob.get("Hr").add_employee(02, "Kishore", 15000);
		ob.get("Sales").add_employee(03, "Akash", 15000);
		
		ob.get("Sales").display_employees(); 
//		dp.count_employess();
		
		Department dp2 = new Department("Employee");
		dp2.add_employee(01, "Suriya", 12000);
		dp2.add_employee(02, "Kishore", 12000);
		dp2.add_employee(03, "Akash", 12000);
//		dp2.display_employees();
				
	}
}
