package model;

public class User {
	int id;
	String name;
	long accountNo;
	String password;
	
	public User(int id,String name,long accountNo,String password) {
		this.id = id;
		this.name = name;
	}
	
	public void setAccountNo(long num) {
		accountNo = num;
	}

	public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}
	
	public long getAccountNo() {
		return accountNo;
	}
	
}