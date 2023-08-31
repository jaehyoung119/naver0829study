package Bit701.day0831;

import java.util.Date;
import java.util.Scanner;

public class 연습장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner ac = new Scanner(System.in);
       System.out.println("도움이 필요하시면 1번");
       System.out.println("안내를 들으시려면 2번");
       System.out.println("다시 들으시려면 #버튼");
       System.out.println("종료하려면 0번");
      int num = ac.nextInt();
      switch(num) {
	case 1 :
        System.out.println("안녕하세요");
        System.out.println("무엇을 도와드릴까요?");
       break;
       case 2 :
       System.out.println("이번역은 고속터미널입니다.");
       break;
       default :
    	   System.out.println("감사합니다.");
      }
		
	
		
        

	}

}
