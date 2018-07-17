package test23;

import java.util.ArrayList;

import test21.Student;
import test22.ListTest;

public class Controller {
	public void callOrder(String order) {
		Service s = new Service();
		ArrayList<Service> al = new ArrayList<Service>();
		if("1".equals(order)) {
			System.out.println("show User List");
			al.add(s);
			al.add(s);
			al.add(s);
			System.out.println(al.size());
		}else if("2".equals(order)) {
			System.out.println("add User");
		}else if("3".equals(order)) {
			System.out.println("Modify User");
		}else if("4".equals(order)) {
			System.out.println("delete User");
		}else if("q".equals(order)) {
			System.out.println("exit");
			System.exit(0);
		}else {
			System.out.println("can not use command");
		}
	}
}
