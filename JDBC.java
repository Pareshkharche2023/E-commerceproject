package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// same

										// make the connection(        url,       host name ,DB name,  user name,password)
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

			// sql query
			
			String sql = "insert into employeedetails(emp_name,emp_salary,emp_email) values('Hardik','150000','Hardik47@gmail.com')";
			
			// by statement
			Statement stmt = connection.createStatement();

			stmt.execute(sql);
			
			
			System.out.println("Record inserted successfully...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}