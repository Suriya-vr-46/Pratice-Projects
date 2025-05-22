package jdbc;

public class Main {

	public static void main(String[] args) {
		DBConnection db = new  DBConnection();
		if (db.getConnection() == null) {
			System.out.println("DB failed to connect!");
		}
	}

}
