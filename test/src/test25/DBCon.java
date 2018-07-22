package test25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon { 
	private static Connection con;
	private static final String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
	private static final String userName = "root";
	private static final String passWord = "1q2w3e4r!";
	
	private static void openCon() { 
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			DBCon.con = DriverManager.getConnection(url, userName, passWord);
			con.setAutoCommit(true);	// 트랜잭션 쓰고수정하는걸 묶어주어 데이터가 유지될수 있도록 함
										// 자동저장기능을 false로 함으로써 저장하지 않음
										// 트랜잭션과 별도로 작용함 안건드리는게 나음 실행은하지만 저장은하지않아 다음데이터입력시 실행했던데이터를 넘어감
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		if(DBCon.con==null) {
			openCon();
	}
		return DBCon.con;
	}
	
	public static void closeCon() {
		if(DBCon.con != null) {
			try {
				DBCon.con.close();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		DBCon.con = null;
	}
}

