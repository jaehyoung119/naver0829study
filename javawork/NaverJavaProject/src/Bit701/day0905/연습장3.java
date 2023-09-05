package Bit701.day0905;

import java.util.Scanner;

public class 연습장3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean play = true;
		int total =0;

		while(play) {
			System.out.println("---------------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("---------------------------");
			int choose =sc.nextInt();
			
			if (choose ==1) {
				System.out.print(" 선택>"+choose);
				System.out.println(" 예금액을 입력하세요");
				int money = sc.nextInt();
				System.out.println("예금액>"+money);
				total += money;

			} else if (choose ==2) {
				System.out.print("선택>"+choose);
				System.out.println(" 출금액을 입력하세요");
				int outMoney = sc.nextInt();
				System.out.println("출금액>"+outMoney);
				total -= outMoney;

			} else if (choose ==3) {
				System.out.print("선택>"+choose);
				System.out.println("잔고> "+total);

			} else if (choose ==4) {
				System.out.println(" 선택>"+choose);
				play = false;
				System.out.println("프로그램 종료");

			} else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("1~4 사이로 입력바랍니다.");
				continue;
			}
		}

	}

}
