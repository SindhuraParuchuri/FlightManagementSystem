package com.cg.JdbcUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtility {
	public static Connection connect() throws ClassNotFoundException, SQLException {
		Connection con=null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FMS","root", "9848516874");
		return con;
		
	}

}
