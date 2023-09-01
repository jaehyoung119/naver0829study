package Bit701.day0901;

import java.util.Scanner;

public class Ex6_ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   /*
    *  구구단을 출력할 시작단 입력
    *  4
    *  구구단을 출력할 끝단 입력
    *  6
    *  
    *   4단    5단    6단
    *   
    *  4x1=4  5x1=5  6x1=6
    *  4x2=8  5x2=10 6x2=12
    */
   
  /* int dan;
   int dan2;
   System.out.println("구구단을 출력할 시작단 입력");
   dan = sc.nextInt();
   System.out.println("구구단을 출력할 끝단 입력");
   dan2 = sc.nextInt();
 
   System.out.println(dan+"단\t" +dan2+"단");
   for(int i=1; i <=9; i++) {
	   System.out.println(dan + "x"+i+"="+(dan*i));
	   for(int j=1; j <=9; j++) {
		   System.out.println(dan2 + "x"+j+"="+(dan2*j));
	   }
   } */
	
   System.out.println("구구단을 출력할 시작단 입력");
   int start=sc.nextInt();
   System.out.println("구구단을 출력할 끝단 입력");
   int end=sc.nextInt();
   
   //start가 end 보다 클경우 두 변수의 값을 바꿔보자
   if(start>end) {
	   int temp = start;
	   start=end;
	   end=temp;
   }
   
   for(int dan=start;dan<=end;dan++) {
	   System.out.printf("%6d단  ",dan);
   }
   System.out.println("\n");
   for(int i=1;i<=9;i++) {
	   for(int dan=start;dan<=end;dan++) {
		   System.out.printf("%5dx%d=%2d",dan,i,dan*i);
	   }
	   System.out.println();
   }
	
	
	}

}
