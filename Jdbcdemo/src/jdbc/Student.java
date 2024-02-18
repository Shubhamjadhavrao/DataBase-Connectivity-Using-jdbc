package jdbc;

public class Student {
	private int StudentId;
	private String Name;
	private int RollNo;
	private String Address;

	public Student() {
		super();

	}

	public Student(int studentId, String name, int rollNo, String address) {
		super();
		StudentId = studentId;
		Name = name;
		RollNo = rollNo;
		Address = address;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", Name=" + Name + ", RollNo=" + RollNo + ", Address=" + Address
				+ "]";
	}

}
