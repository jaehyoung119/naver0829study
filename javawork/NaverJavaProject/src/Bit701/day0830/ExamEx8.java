package Bit701.day0830;

import java.nio.file.spi.FileSystemProvider;

public class ExamEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // money 변수에 args[0] 값을 대입후(급여:백만단위:5674321)
		/*
		 * 출력
		 * money : 5674321원
		 * 만원짜리 567 장
		 * 천원짜리 4장
		 * 백원짜리 3개
		 * 십원짜리 2개
		 * 일원짜리 1개
		 * 산술연산자를 사용해서 출력해보세요
		 */
	    int abcder = 5674321;
	    int 만원 = abcder/10000;        // 567.4321 int 로표현이니 567
	    int 천원 = (abcder%10000)/1000; // (money%10000)= 4321/1000 4.321 즉 4
	    int 백원 = (abcder%1000)/100;   // (money%1000)= 321/100 3.21 즉 3
	    int 십원 = (abcder%100)/10;     // (money%100)= 21/10 2.1 즉 2
	    int 일원 = (abcder%10)/1;       // (money%10)= 1/1 1.0 즉 1
	    System.out.println("money :"+ abcder +"원");
	    System.out.println("만원짜리 : "+만원+" 장");
	    System.out.println("천원짜리 : "+천원+" 장");
	    System.out.println("백원짜리 : "+백원+" 개");
	    System.out.println("십원짜리 : "+십원+" 개");
	    System.out.println("일원짜리 : "+일원+" 개");  // 내 답안
	    System.out.println("----------------------");
	    
	    // 선생님 답안
	    // 파라미터에서 월급여를(문자열) 정수타입으로 변환한다
	    int money = Integer.parseInt(args[0]);
	    System.out.println("월 급여 :"+money+ "원");
	    System.out.println("만원짜리 "+money/10000+"장");
	    System.out.println("천원짜리 "+(money%10000)/1000+"장");
	    System.out.println("백원짜리 "+(money%1000)/100+"개");
	    System.out.println("십원짜리 "+(money%100)/10+"개");
	    System.out.println("일원짜리 "+(money%10)/1+"개");
	    
	    
	    
		
	}

}
