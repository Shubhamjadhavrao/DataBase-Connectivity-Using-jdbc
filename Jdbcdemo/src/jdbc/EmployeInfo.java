package jdbc;

public class EmployeInfo {
	private int id;
	private String Name;
	private String PhoneNo;
	private String City;

	public EmployeInfo() {
		super();

	}

	public EmployeInfo(int id, String name, String phoneNo, String city) {
		super();
		this.id = id;
		Name = name;
		PhoneNo = phoneNo;
		City = city;
	}

	public EmployeInfo(String name, String phoneNo, String city) {
		super();
		Name = name;
		PhoneNo = phoneNo;
		City = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "EmployeInfo [id=" + id + ", Name=" + Name + ", PhoneNo=" + PhoneNo + ", City=" + City + "]";
	}

}
