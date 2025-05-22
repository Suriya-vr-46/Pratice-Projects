package School;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		HashMap<String,School> ob = new HashMap<>();
		
		ob.put("Ngp",new School("Ngp"));
		ob.get("Ngp").add_student(62, "Suriya");
		ob.get("Ngp").add_student(26, "Jeeva");
		ob.get("Ngp").add_student(34, "Kishore");
		
		ob.put("Kpr", new School("Kpr"));
		ob.get("Kpr").add_student(21, "Vijay");
		ob.get("Kpr").add_student(45, "Akash");
		ob.get("Kpr").add_student(35, "Mohan");
		
		ob.get("Ngp").display_students();
		ob.get("Kpr").display_students();
		
		System.out.println();
//		Count
		ob.get("Ngp").getCount();
	}
}
