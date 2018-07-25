package test27.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import test27.DBCon;
import test27.MemberDAO;

public class MemberDAOImpl implements MemberDAO {
	Connection con;
	
	@Override
	public ArrayList<HashMap<String, String>> selectMember(HashMap<String, String> member) {
		this.con = DBCon.getCon();
		ArrayList<HashMap<String, String>> userList = new ArrayList<HashMap<String, String>>();

		String sql = "select * from member";
		if (member != null) {
			if (member.get("memName") != null) {
				sql += " where memName=?";
			}
		}
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			if (member != null) {
				if (member.get("memName") != null) {
					ps.setString(1, member.get("memName"));
				}
			}
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				HashMap<String, String> user = new HashMap<String, String>();
				user.put("memNum", rs.getString("memNum"));
				user.put("memName", rs.getString("memName"));
				user.put("memId", rs.getString("memId"));
				user.put("memPwd", rs.getString("memPwd"));
				user.put("credat", rs.getString("credat"));
				user.put("cretim", rs.getString("cretim"));
				user.put("moddat", rs.getString("moddat"));
				user.put("modtim", rs.getString("modtim"));

				userList.add(user);
			}
			con.commit();
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			DBCon.closeCon();
		}
		return userList;
	}

	@Override
	public int insertMember(HashMap<String, String> member) {
		this.con = DBCon.getCon();
		int result = 0;
		String sql = "insert into member (memNum, memName, memId, memPwd, memAge, memEtc, credat, cretim, moddat, modtim)";
		sql += " values (mem_seq.nextval,?,?,?,?,?,to_char(sysdate, 'YYYYmmdd'),to_char(sysdate, 'HH24miss'),to_char(sysdate, 'YYYYmmdd'),to_char(sysdate, 'HH24miss'))";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, member.get("memName"));
			ps.setString(2, member.get("memId"));
			ps.setString(3, member.get("memPwd"));
			ps.setString(4, member.get("memAge"));
			ps.setString(5, member.get("memEtc"));

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

	@Override
	public int deleteMember(HashMap<String, String> member) {
		this.con = DBCon.getCon();
		int result = 0;
		String sql = "delete from member";
		if (member != null) {
			if (member.get("memName") != null) {
				sql += " where memName=?";
			}
		}
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			if (member != null) {
				if (member.get("memName") != null) {
					ps.setString(1, member.get("memName"));
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
			DBCon.closeCon();
		}
		return result;
	}

	@Override
	public int updateMember(HashMap<String, String> member) {

		int result = 0;
		this.con = DBCon.getCon();
		String sql = "update member";
		if (member != null) {
			if (member.get("memName") != null) {
				sql += " set memId=?,memPwd=?,memAge=?,memEtc=? where memName=?";
			}
		}
		try {
			PreparedStatement ps = this.con.prepareStatement(sql);
			if (member != null) {
				if (member.get("memName") != null) {
					ps.setString(1, member.get("memId"));
					ps.setString(2, member.get("memPwd"));
					ps.setString(3, member.get("memAge"));
					ps.setString(4, member.get("memEtc"));
					ps.setString(5, member.get("memName"));
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
			DBCon.closeCon();
		}
		return result;
	}

}
