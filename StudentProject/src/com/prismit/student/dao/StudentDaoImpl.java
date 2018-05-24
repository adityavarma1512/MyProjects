package com.prismit.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDaoImpl {
	static Connection conn = null;
	//DatabaseConnection databaseConnection = new DatabaseConnection();
	
	private DatabaseConnection databaseConnection;
	
	
	public DatabaseConnection getDatabaseConnection() {
		return databaseConnection;
	}

	public void setDatabaseConnection(DatabaseConnection databaseConnection) {
		this.databaseConnection = databaseConnection;
	}

	public void insert(String fName, String lName, String email) {
		
		try {
			/*
			 * Class.forName("oracle.jdbc.driver.OracleDriver"); conn =
			 * DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
			 * "sys as sysdba", "admin123");
			 */
			conn = databaseConnection.getConnection();
			PreparedStatement pst = conn.prepareStatement("insert into student_table values(?,?,?)");
			pst.setString(1, fName);
			pst.setString(2, lName);
			pst.setString(3, email);
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			databaseConnection.closeConnection(conn);
		}
	}

	public void getstudentlist() {
		
		try {
			/*Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sys as sysdba", "admin123");*/
			
			conn = databaseConnection.getConnection();
			PreparedStatement pst = conn.prepareStatement("select f_Name,l_Name,email from student_table");
			ResultSet resultSet = pst.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString("f_Name"));
				System.out.println(resultSet.getString("l_Name"));
				System.out.println(resultSet.getString("email"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			databaseConnection.closeConnection(conn);
		}

	}
	
}
