package Bit701.day0905;

import java.util.Scanner;

public class Ex1_JuminNo {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		boolean play = true;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("주민번호를 입력하세요");
			String jumin = sc.nextLine();

			if(play) {
				System.out.print(jumin.substring(0,2)+"년 ");
				System.out.print(jumin.substring(2,4)+"월 ");
				System.out.println(jumin.substring(4,6)+"일생");

				char sex = jumin.charAt(7);
				switch(sex) {
				case '1' :
				case '3' :
					System.out.println("내국인");
					System.out.println("남성");
					break;
				case '2' :
				case '4' :
					System.out.println("내국인");
					System.out.println("여성");
					break; 
				case '5' :
				case '6' :
					System.out.println("외국인");
					break;
				default :
					System.out.println("알수없는 성별입니다.");
					break;
				}
			}	
			System.out.println("계속하시겠습니까? y/n");
			String goGo = sc.nextLine();
			if(goGo.equals("y")) {
				continue;
			} else if(goGo.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				
			}
		}while(play);
	}
}


		
//		Scanner sc = new Scanner(System.in);
//		String juminNo;
//
//		while(true) {
//			System.out.println("주민등록 번호 입력");
//			juminNo=sc.nextLine();
//			//q or Q 입력시 종료
//			if(juminNo.equalsIgnoreCase("q")) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//			String yearStr = juminNo.substring(0,2);
//			String monthStr = juminNo.substring(2,4);
//			String dayStr = juminNo.substring(4,6);
//			char gender=juminNo.charAt(7);
//			System.out.println(yearStr+"년"+monthStr+"월 "+dayStr+"일");
//
//			if(gender=='1' ||gender=='2' ||gender=='3' ||gender=='4')
//				System.out.println("내국인");
//			else if(gender=='5' ||gender=='6')
//				System.out.println("외국인");
//			else
//				System.out.println("8번째 값을 잘못 입력했어요");
//
//			switch(gender) {
//			case '1': case'3': case'5':
//				System.out.println("남자");
//				break;
//			case '2': case'4': case'6':
//				System.out.println("여자");
//			default:
//				System.out.println("성별 알수 없음");
//			}
//
//		}
