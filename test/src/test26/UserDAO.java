package test26;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserDAO {

	public ArrayList<HashMap<String, String>> selectUserList(HashMap<String, String> user);
	public int insertUserList(HashMap<String,String> user);
	
}
