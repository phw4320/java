package test251.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import org.omg.CosNaming.NamingContextPackage.NotFound;

import test251.DBCon;
import test251.UserDAO;

public class UserDAOImpl implements UserDAO {
	private Connection con;
	int result = 0;
	@Override
	public ArrayList<HashMap<String, String>> selectUserList(HashMap<String, String> user) {
		this.con = DBCon.getCon();
		String sql = "select * from user_info";
		ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String,String>>();
		if (user!=null) {
			if (user.get("uiName")!=null) 
			{ sql+= " where uiName=?"; }
		}
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			if (user!=null) {
				if (user.get("uiName")!=null) 
				{ ps.setString(1, user.get("uiName")); }
			}
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				HashMap<String, String> userTmp = new HashMap<String, String>();
				userTmp.put("uiName", rs.getString("uiName"));
				userTmp.put("uiAge", rs.getString("uiAge"));
				userTmp.put("uiCredat", rs.getString("uiCredat"));
				userTmp.put("uiCretim", rs.getString("uiCretim"));
				userTmp.put("uiDelete", rs.getString("uiDelete"));
				userTmp.put("uiEtc", rs.getString("uiEtc"));
				userList.add(userTmp);
			}
 		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				this.con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return userList;
	}
	@Override
	public int insertUserList(HashMap<String, String> user) {
		
		this.con = DBCon.getCon();

		String sql = "insert into user_info (uiName, uiAge, uiCredat, uiCretim, uiDelete, uiEtc)";
		sql+= " values (?,?,?,?,0,?)";
		
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
			DBCon.closeCon();
		}
		return result;
	}




	
	public int deleteUserList(HashMap<String, String> user) {
		return 0;
		
	}
	
	public int updateUserList(HashMap<String, String> user) {
		return 0;
		
	}
 
}
