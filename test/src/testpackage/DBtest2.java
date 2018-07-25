package testpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBtest2 {

	public static void main(String[] args) {
		boolean a = true;
		int b = 1; 
		System.out.println();
	}

}

//Statement stmt = conn.createStatement(); //statement객체생성,
//PreparedStatement pstmt = conn.prepareStatement(sql);
//Statement는 자신의 객체를 생성하면서 쿼리문을 전달할 수 없습니다.

//PreparedStatement객체는 Connnection 객체의 prepareStatement메소드를 통해서 sql문을 전달할 수 있다
//에 해당하는 인자를 setString이나 setInt... 등 여러메소드들을 통해 인자값을 설정해줄 수 있다
