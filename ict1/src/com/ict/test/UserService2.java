package com.ict.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService2 {
	private static UserService2 us;
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String id = "ictu";
	private static String pwd = "12345678";
	private static String driver = "oracle.jdbc.driver.OracleDriver";

	public static UserService2 getUserService() {
		if (us == null) {
			us = new UserService2();
		}
		return us;
	}

	public static List<Map<String, String>> getUserList(String searchStr, String[] check) {
		List<Map<String, String>> userList = new ArrayList<Map<String, String>>();
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("접속 완료");
			String sql = "select * from user_info";
			
			if (searchStr != null) {
				sql += " where uiName like '%' || ? || '%'";
			}
			PreparedStatement ps = con.prepareStatement(sql);

			if (searchStr != null) {
				ps.setString(1, searchStr);
			}
			ResultSet rs = ps.executeQuery();
			Map<String, String> user;
			while (rs.next()) {
				user = new HashMap<String, String>();
				user.put("name", rs.getString("uiName"));
				user.put("id", rs.getString("uiId"));
				user.put("pwd", rs.getString("uiPwd"));
				userList.add(user);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 없는 에러");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 접속 에러");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
			con = null;
		}
		// System.out.println(userList);
		return userList;
	}
}