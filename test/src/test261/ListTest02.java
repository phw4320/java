package test261;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class ListTest02 {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		//Integer num = (int)(Math.random()*10)+1;
		/*strList.add(num.toString());
		num = (int)(Math.random()*10)+1;
		strList.add(num.toString());
		num = (int)(Math.random()*10)+1;
		strList.add(num.toString());*/
		
		/*for(int i=0; i<strList.size(); i++) {
			System.out.print(strList.get(i) + ", ");
		}*/
		
		for(int i = 0; i<10;i++) {
	         Integer num = (int)(Math.random()*10)+1;
	         
	         String str = StringUtils.leftPad(num.toString(),3,'0');
	         
	         strList.add(str);
	      }
	      
		System.out.println("");
		Collections.sort(strList);
		Collections.reverse(strList);
		for(int i=0; i<strList.size(); i++) {
			System.out.print(strList.get(i) + ", ");
		}

	}

}
