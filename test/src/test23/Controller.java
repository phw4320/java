package test23;

import java.util.ArrayList;

import test21.Student;
import test22.ListTest;

public class Controller {
	Service a = new Service();
	public void callOrder(String order) {
		
		//ArrayList<Service> al = new ArrayList<Service>();
		//boolean isOk = true;
		
		if("1".equals(order)) {
			System.out.println("show User List");
			a.print();
			
		}else if("2".equals(order)) {
			System.out.println("add User");
			System.out.println("리스트에 등록할 이름과 나이 번호를 입력하세요.");
			a.add();
			System.out.println("등록완료");
			
		}else if("3".equals(order)) {
			System.out.println("modify User");
			System.out.println("수정할 사람의 번호를 입력하세요");
			a.modify();
		}else if("4".equals(order)) {
			System.out.println("delete User");
			System.out.println("삭제할 사람의 번호를 입력하세요");
			a.delete();
			
		}else if("q".equals(order)) {
			System.out.println("exit");
			
			//System.exit(0);
			Exec.isOk = false;
		}else {
			System.out.println("can not use command");
		}
		
	}
}
