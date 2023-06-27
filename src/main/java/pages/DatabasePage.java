package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	String columnValue = null;

	public String getDatafromSQL(String columnName) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlURL = "jdbc:mysql://localhost:3306/december2022";
			String sqlUserName = "root";
			String sqlPassword = "root1234";
			String sqlQuery = "Select * from users;";
			
			connection = DriverManager.getConnection(sqlURL, sqlUserName, sqlPassword);
			
			statement = connection.createStatement();
			
			resultSet = statement.executeQuery(sqlQuery);
			
			while(resultSet.next()) {
				columnValue = resultSet.getString(columnName);
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			if(resultSet!=null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	
		return columnValue;
	}
		
}
