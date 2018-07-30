package test22;

import java.util.HashMap;
import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();		//해쉬맵의 키와 같은 역할
		hs.add("d");
		hs.add("d");
		hs.add("g");
		System.out.println(hs.add("dd"));
		System.out.println(hs.add("dd"));				// 중복이면 false
		System.out.println(hs.add("dd"));
		System.out.println(hs.add("dd"));
		System.out.println(hs.add("dd"));
		System.out.println(hs);
		System.out.println(hs.size());					// 중복안됨
	}

}
