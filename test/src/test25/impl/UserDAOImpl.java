package test25.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import test25.DBCon;
import test25.UserDAO;

public class UserDAOImpl implements UserDAO {

	private Connection con;
	
	public UserDAOImpl() {		//구현받기떄문에 userDAO로 불림, object로부터 상속받기때문에 object라고 불림, userDAOUmpl로 불림
		this.con = DBCon.getCon();
	}
	
	@Override
	public int insertUserInfo(HashMap<String, String> userInfo) {
		String sql = "insert into user_info";
		sql += "(uiName, uiAge, uiCredat, urCretim, uiEtcm uiDelete)";
		sql += "values(?,?,date_format(now(), '%y%m%d'),date_format(now(), '%h%i%s'),?,'0')";		//데이터바인딩
		//  sql을 파싱해서 사용하는 prepareStatement 사용
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);	//만들때 sql을 넣어서만듬 // 만들고 sql읽는 statement와는 다름
			ps.setString(1, userInfo.get("uiName"));
			ps.setString(2, userInfo.get("uiAge"));
			ps.setString(3, userInfo.get("uiEtc"));
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return 0;
	}

	@Override
	public int deleteUserInfo(HashMap<String, String> userInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserInfo(HashMap<String, String> userInfo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<HashMap<String, String>> selectUserInfo(HashMap<String, String> userInfo) {
		// TODO Auto-generated method stub
		return null;
	}

}
