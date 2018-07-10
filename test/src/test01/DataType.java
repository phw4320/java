package test01;
// 변수라는 것을 선언하기 위해서 
// 데이터타입을 지정해줘야 합니다.
// 데이터타입 변수명; <--- 변수의 선언.
// 데이터타입 변수명 = 데이터타음 알맞은 값 <-- 변수의 초기화
// 자바에서는 변수의 선언만으로는 해당 변수를 사용할 수 없다.
// -규칙
// 클래스명(자바명) 반드시 첫글자 대문자
// 만약에 두 개의 단어가 합쳐졌다면 두 번째 단어의 첫글자도 대문자
// ex -> NumberTest <-- number의 n 대문자, test의 t도 대문자여야함.
// 변수명 영문 소문자로 시작해야합니다.
// 만약에 두개의 단어가 합쳐졌다면 두 번째 단어의 첫글자가 대문자
// ex -> numberTest <-- number의 n 소문자, test의 t 대문자
// ex -> myNumberTest <-- 세번째 단어의 첫글자도 대문자

public class DataType {
public static void main(String[] args) {
	for(int i=1; i<=10; i++) {
		System.out.println(i);
	}
	int i=1;
	for (;i<3;i++) {
		System.out.println(i);
	}
	System.out.println(i);
}
}
