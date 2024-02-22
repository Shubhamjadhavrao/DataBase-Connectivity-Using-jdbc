package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmpStart {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome To Employe Information App");
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to Add Employee");
			System.out.println("Press 2 Delete Employee");
			System.out.println("Press 3 To Display Employee ");
			System.out.println("Press 4 To Update");
			System.out.println("Press 5 Exit");
			int choice = Integer.parseInt(br.readLine());
			
			if(choice==1) {
//				add employee
				System.out.println("Enter Employe Name: ");
				String neme = br.readLine();
				
				System.out.println("Enter Employe PhoneNo: ");
				String PhoneNo= br.readLine();
				
				System.out.println("Enter Employe City: ");
				String City = br.readLine();
				
//				create employee Object to store employee
				EmployeInfo em = new EmployeInfo(neme, PhoneNo, City);
				boolean answer = Employee.employeToDB(em);
				if(answer) {
					System.out.println("Employee Successfully added....");
				}else {
					System.out.println("Somthing Went Wrong try again....");
				}
				System.out.println(em);
				
				
			}else if(choice==2) {
//				delete employee
				System.out.println("Enter Employe id to Delete:");
				int userId = Integer.parseInt(br.readLine());
				boolean e= Employee.deleteEmployee(userId);
				if(e) {
					System.out.println("Deleted......");
				}else {
					System.out.println("Somting went wrong......");
				}
				
			}else if(choice==3) {
//				Display employee
				Employee.showAllEmployee();
			}else if(choice==4) {
//				Update
				System.out.println("Update Employe Name: ");
				String neme = br.readLine();
				
				System.out.println("Update Employe PhoneNo: ");
				String PhoneNo= br.readLine();
				
				System.out.println("Update Employe City: ");
				String City = br.readLine();
				EmployeInfo em = new EmployeInfo(neme, PhoneNo, City);
				boolean update= Employee.updateEmployee(em);
				if(update) {
					System.out.println("Updated Successfully......");
				}else {
					System.out.println("Somting went wrong......");
				}
				
			}else {
//				Exit
				break;
			}
		}
		
		System.out.println("Thank You!!!!");
	}

	

}
