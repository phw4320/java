package test08;

import test09.Obj;

public class test111 extends Obj {
	public static void main(String[] args) {
	Obj o = new Obj();
	o.num = 1;
	//String a = o.getStr();	// 접근제어자 private로 접근불가
	int b = o.getNum();
	}
}
 