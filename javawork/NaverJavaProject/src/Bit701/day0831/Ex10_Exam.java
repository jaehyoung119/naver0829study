package Bit701.day0831;

import java.util.Scanner;

public class Ex10_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         * 상품명과 수량, 단가를 각각 입력받은후 총금액을 출력하시오
         * 그리고 수량이 5개 이상일경우 10프로 할인된 최종 금액도 출력해주세요
         * 
         * (예)
         * 상품명 : 딸기
         * 수량:6
         * 단가:1000
         * 
         * 총금액 : 6000 원
         * 5개 이상 10프로 할인된 금액 : 5400원
         */
		Scanner abc = new Scanner(System.in);
		
		
	    System.out.println("상풍명을 입력하시오");
		String object = abc.nextLine();
		System.out.println("상품명 : "+object);
		
	    System.out.println("수량을 입력하시오");
	    int count = abc.nextInt();
	    System.out.println("수량 : "+count);
	    
	    System.out.println("단가를 입력하시오");
	    int price = abc.nextInt();
	    System.out.println("단가 : "+price+"원");
	    
	    System.out.println("총금액 : "+(count*1000)+ "원");
	    int totalPrice = count * 1000;
	    if(count >= 5) {
	    	price=totalPrice-(totalPrice/10);
	    }
	    System.out.println("5개 이상 10프로 할인된 금액 : "+price+"원");
	    
	   
	    
	    
	 }

}
