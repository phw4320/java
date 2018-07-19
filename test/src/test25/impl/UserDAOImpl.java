package test25.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import test25.DBCon;
import test25.UserDAO;

public class UserDAOImpl implements UserDAO {

	private Connection con;
	
	public UserDAOImpl() {		//구현받기떄문에 userDAO로 불림, object로부터 상속받기때문에 object라고 불림, userDAOImpl로 불림
		this.con = DBCon.getCon();
	}
	
	@Override
	public int insertUserInfo(HashMap<String, String> userInfo) {
		String sql = "insert into user_info";
		sql += "(uiName, uiAge, uiCredat, uiCretim, uiEtc, uiDelete)";
		sql += "values(?,?,date_format(now(),'%y%m%d'),date_format(now(),'%h%i%s'),?,'0')";		//데이터바인딩
		//  sql을 파싱해서 사용하는 preparedStatement 사용
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);	//만들때 sql을 넣어서만듬 // 만들고 sql읽는 statement와는 다름
			ps.setString(1, userInfo.get("uiName"));
			ps.setString(2, userInfo.get("uiAge"));
			ps.setString(3, userInfo.get("uiEtc"));
			System.out.println(ps.executeUpdate());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
				
		// statement = 실행마다 쿼리실행하여 파라미터 달라질시에 다른 쿼리로 인식할 가능성이 있어 권장하지않음
		// preparedstatement = 파라미터가 달라져도 쿼리의 실행계획이 같고 쿼리문의 변형을 할수없다. 여러개실행하기 용이하다 이미 사전에 컴파일된 SQL문을 포함
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


