package test25;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserDAO {
	
	public int insertUserInfo(HashMap<String,String> userInfo);
	public int deleteUserInfo(HashMap<String,String> userInfo);
	public int updateUserInfo(HashMap<String,String> userInfo);
	public ArrayList<HashMap<String,String>> selectUserInfo(HashMap<String,String> userInfo);
	
}
