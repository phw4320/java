package test26.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;


import test26.DBCon;
import test26.UserDAO;
 
public class UserDAOImpl implements test26.UserDAO {
	private Connection con;
	int result = 0;

	@Override
	public ArrayList<HashMap<String, String>> selectUserList(HashMap<String, String> user) {

		this.con = DBCon.getCon();

		ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();
	

		String sql = "select * from user_info";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				HashMap<String, String> hm = new HashMap<String, String>();
				hm.put("uiName", rs.getString("uiName"));
				hm.put("uiAge", rs.getString("uiAge"));
				hm.put("uiCredat", rs.getString("uiCredat"));
				hm.put("uiCretim", rs.getString("uiCretim"));
				hm.put("uiDelete", rs.getString("uiDelete"));
				hm.put("uiEtc", rs.getString("uiEtc"));
				userList.add(hm);
			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		return userList;
	}

	@Override
	public int insertUserList(HashMap<String, String> user) {

		this.con = DBCon.getCon();

		String sql = "insert into user_info (uiName, uiAge, uiCredat, uiCretim, uiDelete, uiEtc)";
		sql += " values (?,?,?,?,0,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.get("uiName"));
			ps.setString(2, user.get("uiAge"));
			ps.setString(3, user.get("uiCredat"));
			ps.setString(4, user.get("uiCretim"));
			ps.setString(5, user.get("uiEtc"));

			result = ps.executeUpdate();
			this.con.commit();

		} catch (SQLException e) {
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		return result;
	}

	@Override
	public int deleteUserList(HashMap<String, String> user) {
		this.con = DBCon.getCon();
		String sql = "delete from user_info";
		if (user != null) {
			if (user.get("uiName") != null) {
				sql += " where uiName=?";
			}
		}
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			if (user != null) {
				if (user.get("uiName") != null) {
					ps.setString(1, user.get("uiName"));
				}
			}
			result = ps.executeUpdate();
			this.con.commit();
		} catch (SQLException e) {
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		return result;
	}

	@Override
	public int updateUserList(HashMap<String, String> user) {
		int result = 0;
		this.con = DBCon.getCon();
		String sql = "update user_info";
		if (user != null) {
			if (user.get("uiName") != null) {
				sql += " set uiAge=?,uiCredat=?,uiCretim=?,uiEtc=? where uiName=?;";
			}
		}
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			if (user != null) {
				if (user.get("uiName") != null) {
					ps.setString(1, user.get("uiAge"));
					ps.setString(2, user.get("uiCredat"));
					ps.setString(3, user.get("uiCretim"));
					ps.setString(4, user.get("uiEtc"));
					ps.setString(5, user.get("uiName"));
					}
			}
			result = ps.executeUpdate();
			this.con.commit();
		} catch (SQLException e) {
			try {
				this.con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			DBCon.close();
		}
		return result;
	}
}
