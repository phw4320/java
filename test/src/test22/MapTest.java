package test22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		HashMap<String , String> hm = new HashMap<String , String>();
		hm.put("이름","다람쥐");
		hm.put("이름","다람이");
		hm.put("별명","포로리");
		hm.put("주소","나무");
		
		String name = hm.get("이름");
		System.out.println(name);
		
		if(hm.containsKey("너")){
			System.out.println(hm.values());
		}
		
		Set<Entry<String, String>> set = hm.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> e = (Map.Entry<String, String>)it.next();
			System.out.println("key : " + e.getKey() + ", value : " + e.getValue());
		}
	}
}
