package Bit701.day0831;

import java.util.Date;
import java.util.Scanner;

public class Ex2_KeyInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// Date 클래스를 이용해서 현재 년도를 구해보자
		// 권장 : Calendar (Date 도 많이사용)
		Date date = new Date();
		//getYear 는 1900을 뺀값이 반환
		int curYear=date.getYear()+1900;
		System.out.println("현재 년도:"+curYear);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("용사의 태어난 년도는?");
		//문자열로 읽은후 숫자로 변환하면 다음 문자열 입력시에도 문제 발생 x
		int birthYear = Integer.parseInt(sc.nextLine());
		
		System.out.println("현재 사는곳은 어디입니까?");
		String address =sc.nextLine();
		
		//나이 구하기
		int age=curYear-birthYear;
		
		System.out.println("저는 "+address+"에 사는 "+birthYear+"년생("+age+"세) 학생입니다");
		System.out.printf("저는 %s에 사는 %d년생 %d세 학생입니다\n",address,birthYear,age);
		
		//20세 이상이면 "성인", 미만이면 "미성년자"라는 글자를 출력
		//if문으로도 가능 조건(삼항)연산자로도 가능
		//String msg=age>=20?"성인":"미성년자";
		
		//if문으로 할경우
		String msg="";
		//지역변수는 자동초기화가 안되고 쓰레기값이 들어있으므로
		//값이 안들어갈경우를 대비해서 초기값을 지정하는것이 좋다
		//지역변수는 그 구역을 빠져나가게되면 자동소멸되므로 사용이 불가능하다
		
		if(age>=20) { //두문장 이상시 구역설정 필수
			msg="성인";
		} else {
			msg="미성년자";
		}
		System.out.println("당신은 "+msg);
		
	
	}

}
