package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {

	public static boolean employeToDB(EmployeInfo em) {
		boolean f = false;

		try {
			// jdbc code

			Connection con = ConnectionDB.CreateC();
			Statement stmt = con.createStatement();
			String q = "insert into employees(name,phoneNo,city) values(?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(q);

			pstmt.setString(1, em.getName());
			pstmt.setString(2, em.getPhoneNo());
			pstmt.setString(3, em.getCity());

			pstmt.executeUpdate();

			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}

	public static boolean deleteEmployee(int userId) {
		boolean f = false;

		try {
			// jdbc code

			Connection con = ConnectionDB.CreateC();
			Statement stmt = con.createStatement();
			String q = "delete from employees where id=?";

			PreparedStatement pstmt = con.prepareStatement(q);

			pstmt.setInt(1, userId);

			pstmt.executeUpdate();

			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}

	public static void showAllEmployee() {

		try {
			// jdbc code

			Connection con = ConnectionDB.CreateC();
			String q = "select * from employees";

			Statement stmt = con.createStatement();

			ResultSet set = stmt.executeQuery(q);
			while (set.next()) {
				int id = set.getInt(1);
				String Name = set.getString(2);
				String PhoneNo = set.getString(3);
				String City = set.getString(4);

				System.out.println("Id: " + id);
				System.out.println("Nase: " + Name);
				System.out.println("PhoneNo: " + PhoneNo);
				System.out.println("City: " + City);

				System.out.println("+++++++++++++++++++++++++++");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean  updateEmployee(EmployeInfo em) {
		
		boolean f = false;

		try {
			// jdbc code

			Connection con = ConnectionDB.CreateC();
			Statement stmt = con.createStatement();
			String q = "UPDATE employees SET name = ?,phoneNo=?,city=? ";

			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1, em.getName());
			pstmt.setString(2, em.getPhoneNo());
			pstmt.setString(3, em.getCity());

			pstmt.executeUpdate();

			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

}
