package Bit701.day0908;
import Bit701.day0908.hello.*;
public class Ex1Obeject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 다른 패키지의 클래스를 생성해보자
		MyHello my=new MyHello();
		my.hello();
		
		// 같은 패키지에 있는 클래스 선언
	    // 다른 클래스라도 같은 패키지일 경우 private 을 제외하고 모두 접근 가능
		// 패키지가 다를경우는 상속관계가 아닐경우 public 만 유일하게 접근가능
		Test t = new Test();
		System.out.println("public 멤버 번수 출력"+t.str1);
		System.out.println("protected 멤버 번수 출력"+t.str2);
		System.out.println("dafault 멤버 번수 출력"+t.str3);
		//System.out.println("private 멤버 번수 출력"+t.str4); // 에러발생- 접근x
	}

}
