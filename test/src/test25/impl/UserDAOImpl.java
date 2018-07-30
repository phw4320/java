package test25.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import test25.DBCon;
import test25.UserDAO;

public class UserDAOImpl implements test25.UserDAO {
	static Scanner scan = new Scanner(System.in);
	private Connection con;
	int result = 0;

	public UserDAOImpl() { // 구현받기떄문에 userDAO로 불림, object로부터 상속받기때문에 object라고 불림, userDAOImpl로 불림
		// this.con = DBCon.getCon(); //객체생성시 한번밖에 실행되지 않아 여러명입력받고 finally에서 connect를
		// 닫으면 한번밖에 실행되지 않음
	}

	@Override
	public int insertUserInfo(HashMap<String, String> userInfo) {
		this.con = DBCon.getCon(); // 유저를 넣을때마다 등록	//연결해서등록할때마다 연결하고 등록이끝나면 종료해야한다. 
		String sql = "insert into user_info";
		sql += "(uiName, uiAge, uiCredat, uiCretim, uiEtc, uiDelete)";
		sql += "values(?,?,date_format(now(),'%y%m%d'),date_format(now(),'%h%i%s'),?,'0')"; // 데이터바인딩
		// sql을 파싱해서 사용하는 preparedStatement 사용
		try {
			PreparedStatement ps = this.con.prepareStatement(sql); // 만들때 sql을 넣어서만듬 // 만들고 sql읽는 statement와는 다름
			ps.setString(1, userInfo.get("uiName"));
			ps.setString(2, userInfo.get("uiAge"));
			ps.setString(3, userInfo.get("uiEtc"));

			// return ps.executeUpdate();
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
			DBCon.closeCon(); // 커넥션 종료
		}
		// statement = 실행마다 쿼리실행하여 파라미터 달라질시에 다른 쿼리로 인식할 가능성이 있어 권장하지않음
		// preparedstatement = 파라미터가 달라져도 쿼리의 실행계획이 같고 쿼리문의 변형을 할수없다. 여러개실행하기 용이하다 이미
		// 사전에 컴파일된 SQL문을 포함
		return 1;
	}

	@Override
	public int deleteUserInfo(HashMap<String, String> userInfo) {
		this.con = DBCon.getCon();
		String sql = "delete from user_info";
		int result = 0;
		if(userInfo!=null) {
			if(userInfo.get("uiName")!=null) {
				sql+=" where uiName=?";
			}
		}
		try {
			PreparedStatement ps = this.con.prepareStatement(sql); // 만들때 sql을 넣어서만듬 // 만들고 sql읽는 statement와는 다름
			
			if(userInfo!=null) {
				if(userInfo.get("uiName")!=null) {
					ps.setString(1, userInfo.get("uiName"));
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
			DBCon.closeCon(); // 커넥션 종료
		}
		return result;
	}
	
	@Override
	public int updateUserInfo(HashMap<String, String> userInfo) {
		int result=0;
		this.con = DBCon.getCon(); // 유저를 넣을때마다 등록
		String sql = "update user_info";
		if(userInfo!=null) {
			if(userInfo.get("uiName")!=null || userInfo.get("uiEtc")!=null) {
				sql+=" set uiEtc=?,uiAge=? where uiName=?";
			}
		}
		try {
			PreparedStatement ps = this.con.prepareStatement(sql); // 만들때 sql을 넣어서만듬 // 만들고 sql읽는 statement와는 다름
			
			if(userInfo!=null) {
				if(userInfo.get("uiName")!=null || userInfo.get("uiEtc")!=null) {
					ps.setString(1, userInfo.get("uiEtc"));
					ps.setString(2, userInfo.get("uiAge"));
					ps.setString(3, userInfo.get("uiName"));
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
			DBCon.closeCon(); // 커넥션 종료
		}
		return result;
	}

	@Override
	public ArrayList<HashMap<String, String>> selectUserInfo (HashMap<String, String> userInfo) {
		ArrayList<HashMap<String, String>> userInfoList = new ArrayList<HashMap<String, String>>();
		this.con = DBCon.getCon();
		String sql = "select uiNum, uiName, uiAge, uiCredat, uiCretim, uiDelete, uiEtc from user_info";
		/*String condition = scan.nextLine();
		sql+=condition;
		*/
		if(userInfo!=null) {
			if(userInfo.get("uiName")!=null) {
				sql+=" where uiName=?";
			}
		}
		 
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			if(userInfo!=null) {
				if(userInfo.get("uiName")!=null) {
					ps.setString(1, userInfo.get("uiName"));
				} 
			}
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				HashMap<String, String> user = new HashMap<String, String>();
				user.put("uiNum", rs.getString("uiNum"));
				user.put("uiName", rs.getString("uiName"));
				user.put("uiAge", rs.getString("uiAge"));
				user.put("uiCredat", rs.getString("uiCredat"));
				user.put("uiCretim", rs.getString("uiCretim"));
				user.put("uiDelete", rs.getString("uiDelete"));
				user.put("uiEtc", rs.getString("uiEtc"));
				userInfoList.add(user);
				//System.out.println(userInfoList);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBCon.closeCon();
		}
		
		
		
		return userInfoList;
	}

}
