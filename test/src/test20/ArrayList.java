package test20;

public class ArrayList implements List{
	String[] arr = new String[100];
	int cnt = 0;
	
	public boolean add(String a) {
		arr[cnt++] = a;
		return false;
	}
	
	public String[] getArr() {
		return this.arr;
	}
}
