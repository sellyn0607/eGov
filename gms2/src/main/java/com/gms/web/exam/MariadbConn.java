package com.gms.web.exam;

import java.sql.*;
import java.util.*;

public class MariadbConn {
	public String exam() {
		Connection conn;
		Statement stmt;
		String s="";
		try {			
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager .getConnection(
					"jdbc:mariadb://localhost:3306/mariadb", 
					"mariadb", 
					"mariadb");
			stmt = conn.createStatement();
			String sql = String.format(
					"SELECT USERID FROM MEMBER WHERE USERID='H1'"
					);
			ResultSet rs = stmt.executeQuery(sql);			
		if(rs.next()) {
				s= rs.getString("USERID");
		}else
		{
			s="�������";
		}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
/*	class DBConstant {
		public static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
		public static final String MYSQL_DRIVER = "";
		public static final String MARIADB_DRIVER = "";
		public static final String MSSQL_DRIVER = "";
		public static final String CONNECTION_URL = "";
		public static final String USER_NAME = "";
		public static final String PASSWORD = "mariadb";
	}*/
	
	
/*	public static void main(String[] args) {
		TestDAO td = new TestDAO();
		System.out.println(td.getAge());
	}*/
	
}
