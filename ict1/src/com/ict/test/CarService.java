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

public class CarService {
	private List<Map<String, String>> carList;
	private static CarService cs;
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String id = "ictu";
	private static String pwd = "12345678";
	private static String driver = "oracle.jdbc.driver.OracleDriver";

	public static CarService getCarService() {
		if (cs == null) {
			cs = new CarService();
		}
		return cs;
	}

	public static List<Map<String, String>> getCarList(String searchStr) {
		List<Map<String, String>> carList = new ArrayList<Map<String, String>>();
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("접속 완료");
			String sql = "select * from car";
			System.out.println(searchStr);
			if (searchStr != null) {
				sql += " where carName like '%' || ? || '%'";
				System.out.println(sql);
			}
			PreparedStatement ps = con.prepareStatement(sql);
			
			if (searchStr != null) {
				ps.setString(1, searchStr);
				System.out.println(sql);
			}
			System.out.println(sql);
			ResultSet rs = ps.executeQuery();
			Map<String, String> car;
			while (rs.next()) {
				car = new HashMap<String, String>();
				car.put("name", rs.getString("carName"));
				car.put("price", rs.getString("carPrice"));
				car.put("vendor", rs.getString("carVendor"));
				carList.add(car);
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
		return carList;
	}

	/*public static List<Map<String, String>> getCarList(String searchStr) {
		Connection con = null;
		List<Map<String, String>> carList2 = new ArrayList<Map<String, String>>();
		if (searchStr == null || carList == null) {
			return getCarList();
		}
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("접속 완료");
			String sql = "select carNo, carName, carPrice, carVendor from car";
			
			PreparedStatement ps = con.prepareStatement(sql);
			if (searchStr != null) {
				sql += " where carName = ?";
				ps.setString(1, searchStr);
			}
			ResultSet rs = ps.executeQuery();
			Map<String, String> car;

			while (rs.next()) {
				car = new HashMap<String, String>();
				car.put("name", rs.getString("carName"));
				car.put("price", rs.getString("carPrice"));
				car.put("vendor", rs.getString("carVendor"));
				carList2.add(car);
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
		return carList2;
	}*/

	/*
	 * public List<Map<String, String>> getCarList(String searchStr) { if (searchStr
	 * == null || carList == null) { return getCarList(); } List<Map<String,
	 * String>> carList2 = new ArrayList<Map<String, String>>(); for (Map<String,
	 * String> hm : carList) { if (hm.get("carName").indexOf(searchStr) != -1) {
	 * carList2.add(hm); } } System.out.println(carList2); return carList2; }
	 */
}
