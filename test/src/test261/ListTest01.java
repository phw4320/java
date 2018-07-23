package test261;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
public class ListTest01 {

	/*public static void printList(List<Integer> al) {
		for(Integer i : al) {
			System.out.println(i);
		}
	}
	*/
	public static void main(String[] args) {
		/*ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(13);
		al.add(14);
		printList(al);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(16);
		ll.add(17);
		ll.add(18);
		printList(ll);*/
		
		List<Number> al = new ArrayList<Number>();
		al.add(10);
		al.add(10.1);
		
		for(Number n : al) {
			System.out.println(n);
		}
		for(int i=0; i<al.size(); i++) {
			al.set(i, 30+i);
			System.out.println(al.get(i));
		}
	}
}

