package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentTest3 {

	public static void main(String[] args) throws IOException {
		Connection con = null;
		try {

			// Step 1: Register the driver class (optional)
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step 2: Create connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "shubham28");
			// Step 3: Create Statement
			Statement stmt = con.createStatement();
			// Step 4: Execute query
			String st = "INSERT INTO student(id,Name,RollNo,Address)VALUES(?,?,?,?)";
			PreparedStatement psmt = con.prepareStatement(st);

//			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id:");
			int id = sc.nextInt();

			System.out.println("Enter Name:");
			String Name = sc.next();

			System.out.println("Enter RollNo:");
			int RollNo = sc.nextInt();

			System.out.println("Enter Address:");
			String Address = sc.next();

			psmt.setInt(1, id);
			psmt.setString(2, Name);
			psmt.setInt(3, RollNo);
			psmt.setString(4, Address);

			psmt.executeUpdate();

			System.out.println("Inserted Successfully!!!!!!!");

		} catch (ClassNotFoundException e) {
			System.out.println("Unable to load the Driver because driver class not found!!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Some exception occurred while connecting to the DB!!");
			e.printStackTrace();
		} finally {
			try {
				con.close();
				System.out.println("Connection closed successfully!!!");
			} catch (SQLException e) {
				System.out.println("Error while closing the connection!!");
				e.printStackTrace();
			}

		}
	}
}
