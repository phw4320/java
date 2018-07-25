package test27;

import java.util.ArrayList;
import java.util.HashMap;

public interface MemberDAO {
	public ArrayList<HashMap<String, String>> selectMember (HashMap<String, String> member);
	public int insertMember (HashMap<String, String> member);
	public int deleteMember (HashMap<String, String> member);
	public int updateMember (HashMap<String, String> member);
}