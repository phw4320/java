package testpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBagain {

	public static void main(String[] args) {
		Connection con;
		String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
		String id = "root";
		String pwd = "1q2w3e4r!";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결 성공");
			String sql = "select * from user_info";
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery(sql);
			while(rs.next()) {
				int uNum = rs.getInt("uNum");
				String uName = rs.getString("uName");
				int uAge = rs.getInt("uAge");
				String uAddress = rs.getString("uAddress");
				String uEtc = rs.getString("uEtc");
				
				System.out.println(uNum +", "+ uName+ ", "+uAge+", " +uAddress+", "+uEtc);
			}
			
			sql = "insert into user_info (uName, uAge, uAddress, uEtc) values ('영이',32,'부산','테스트2')";
			//stat.executeUpdate(sql);
			int cnt = stat.executeUpdate(sql);
			if (cnt==1) {
				System.out.println("삽입 성공");
			} else {
				System.out.println("삽입 오류");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("클래스가 없습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결 오류");
		}
		System.out.println("프로그램 종료");
	}

}
