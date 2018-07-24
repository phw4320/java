package test27;

import java.util.ArrayList;
import java.util.HashMap;

import sun.security.krb5.internal.crypto.HmacSha1Aes256CksumType;

public class MapTest1 {
	public static ArrayList <HashMap<String, String>> test() {
		ArrayList <HashMap<String, String>> hm5 = new ArrayList <HashMap<String, String>>();
		for(int i=0; i<3; i++) {
			HashMap<String, String> hm3 = new HashMap<String, String>();		
			hm3.put("name", "first"+i);
			hm3.put("age", "123"+i);
			hm5.add(hm3);
		}
		return hm5;
	}
	public static void main(String[] args) {
	
		/*HashMap<String, String> hm = new HashMap<String, String>();		// key, value 두개 선언해줘야함
		
		hm.put("name", "first");
		hm.put("age", "123");

		HashMap<String, String> hm1 = new HashMap<String, String>();
		
		hm1.put("name", "second");
		hm1.put("age", "456");
		HashMap<String, String> hm2 = new HashMap<String, String>();
		
		hm2.put("name", "third");
		hm2.put("age", "789");*/
		//System.out.println(hm); 	// toString 가지고있기때문에 메모리주소 출력이아닌 내용물 출력
		
		ArrayList <HashMap<String, String>> hm5 = test();

		for(HashMap<String, String> a : hm5) {
			System.out.println(a);
		}
		
		
		//System.out.println(hm);
		/*String str = hm.get("test");
		System.out.println(str);*/
		//System.out.println(hm);
		//System.out.println(hm1);
		//System.out.println(hm2);
		
	}
}
