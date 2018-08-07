package test21;

import java.util.ArrayList;

public class ListTest3 {
	public static void main(String[] args) {
		Student s = new Student("홍기동", 3);
		ArrayList<Student> sList = new ArrayList<Student>();
		int max, min;
		
		/*sList.add(s);
		
		sList.add(s);
		sList.add(s);*/
		for (int i=1; i<=5; i++) {
			String name = "테스트 "+ i;
			int grade = (int)(Math.random() *10) +1;
			sList.add(new Student(name,grade));
		}
		//s = new Student("강민우", 3);	// s를변경 (날 바꾸는건안됨)
		/*s.name = "힝";*/			// s내부를 변경 (안에있는것은 바꿔도됨)
		/*for(Student a : sList) {
			max = a.grade;
			min = a.grade;
				
		}*/
		/*for(int i=0; i<sList.size(); i++) {
			System.out.println(sList.get(i) +"");
		}*/
		/*for(Student a : sList) {
			System.out.println(a.name +", "+ a.grade);
			
		}	*/	
		for(int i=0; i<sList.size(); i++) {
			for(int j=i+1; j<sList.size(); j++) {
				if(sList.get(i).grade <sList.get(j).grade) {
					Student s1 = sList.get(i);
					sList.set(i, sList.get(j));
					sList.set(j, s1);
				}
			}
		}
		for(Student a : sList) {
			System.out.println(a.name +", "+ a.grade);
		}
	}
}
