package Bit701.day0901;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex3_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*
      * 이름,3과목의 점수(kor,eng,mat) 를 입력받은후 총점과 평균(소숫점1자리 출력-NumberFormat)
      * 등급을 출력(grade : 평균이 90이상이면 "Excellent!" 80이상이면 "Good!!" 나머지는 "Try again.." 출력
      */
		
	    NumberFormat score1 = NumberFormat.getInstance();
		Scanner abc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		double kor =abc.nextDouble();
		
	    System.out.println("영어 점수를 입력하세요");
		double eng =abc.nextDouble();
	   
	    System.out.println("수학 점수를 입력하세요");
	    double mat =abc.nextDouble();
	    
	    double total = kor+eng+mat;
	    double score = total/3;
	    score1.setMaximumFractionDigits(1);
	    
	    System.out.println("총점 : " +score1.format(total) +"점");
	    System.out.println("평균 : " +score1.format(score) +"점");
	    
	    if(score>=90) {
	    	System.out.println("Excellent!");
	    } else if (score>=80) {
        	  System.out.println("Good!!");
	    } else { 
	    	System.out.println("Try again..");
	    }
	    
	}

}
