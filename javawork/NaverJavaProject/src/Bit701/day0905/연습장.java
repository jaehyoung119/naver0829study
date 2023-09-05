package Bit701.day0905;

import java.util.Scanner;

public class 연습장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean runnnn=(true);
		int speed = 0;
		
		while(runnnn) {
			System.out.println("1 : 증속  2: 감속  3: 정지");
			System.out.println("선택:");
			
			int choose = sc.nextInt();
			if(choose==1) {
				speed++;
				System.out.println("현재 속도 = "+(speed));
			} else if(choose==2) {
				speed--;
				System.out.println("현재 속도 + "+speed);
			} else if(choose==3) {
				runnnn = false;
			} else {
				System.out.println("잘못된 입력입니다 다시 입력하십시오");
				return;
			}
			
		}
          System.out.println("프로그램 종료");
	}

}
