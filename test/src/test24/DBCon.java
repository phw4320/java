package test24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCon {
	// 접속 마리아db url = MariaDB/127.0.01:3306/oreo
	
	public static void main(String[] args) {
		Connection con;
		String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
		String id = "root";
		String pwd = "12345678";

		try {
			Class.forName("org.mariadb.jdbc.Driver"); // 패키지내의 클래스 //예외처리를 하지않으면 쓸수없음
			con = DriverManager.getConnection(url, id, pwd); // 데이터베이스 창을 띄움 //예외처리를 하지않으면 쓸수없음
			// 데이터베이스에 전화를 검 (포트번호를통해)
			System.out.println("연결 성공");
			Statement stat = con.createStatement(); // 적을 무언가를 만듬, 쿼리문 작성하여 적용하기 위한 용도
			
			// String sql = "Select * from user_info"; // 뷰
			// String sql= "insert into user_info values(6,'철이',10,'경기도','테스트)"; //삽입
			// stat.executeUpdate(sql);
			
			String sql = "delete from user_info where uName = '철수'"; // 삭제
			int cnt = stat.executeUpdate(sql); // 데이터가 있으면 1 없으면 0
			if (cnt == 1) {
				System.out.println("1번 삭제됨");
			} else {
				System.out.println("1번이 없어 삭제불가");
			}
			
			sql = "Select * from user_info";
			ResultSet rs = stat.executeQuery(sql); // 메모리 중복 없음 //실행
			while (rs.next()) { // rs.next는 다음 인덱스의 데이터 있으면 true 없으면 false 반환 //호출할떄마다 처음값 감 넥스트하기전은 첫번째값
				int uNum = rs.getInt("uNum");
				String uName = rs.getString("uName");
				int uAge = rs.getInt("uAge"); 
				String uAddress = rs.getString("uAddress");
				String uEtc = rs.getString("uEtc"); // 1번돌때첫번째 컬럼에있는 데이터값 출력을 위함
				System.out.println(uNum + ", " + uName + ", " + uAge + ", " + uAddress + ", " + uEtc);
			}
			
			sql = "insert into user_info (uName, uAge, uAddress, uEtc) values('철이',64,'충청도','테스트');";
			stat.executeUpdate(sql);				// 삽입
			cnt = stat.executeUpdate(sql);
			if (cnt == 1) {
				System.out.println("추가 완료");
			} else {
				System.out.println("추가 안됨");
			}
			
			
			sql = "update user_info set uAddress='달나라'" + "where uNum=21";
			stat.executeUpdate(sql);				// 수정
			cnt = stat.executeUpdate(sql);
			if (cnt == 1) {
				System.out.println("변경 완료");
			} else {
				System.out.println("변경 안됨");
			}
			
			
			// sql= "insert into user_info values(2,'철이','10','경기도')";*/
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("해당 클래스가 없습니다.");
		} catch (SQLException e) { // 데이터베이스쪽 에러
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결 실패");
		}
		System.out.println("프로그램 종료");
	}
}

// 정보를알려주는 meta data
// 컬럼에 해당하는 raw data