package Bit701.day0906;

import java.util.Scanner;

public class Ex6_ArrayScoreInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*
         * score 에 5개의 배열할당후 키보드로 직접 점수를 입력하여 배열에 저장후
         * 총점과 평균을 구하세요
         */
		Scanner sc=new Scanner(System.in);

		int sum=0;
		double avg;
		int []score = new int[5];

		System.out.println("점수를 입력하세요");
		for (int i=0;i<score.length;i++) {
			System.out.println(i+"번 점수입력");
			score[i]=sc.nextInt();
			// 조건이 0보다 작거나 100보다 크면 0~100사이 점수로 입력바람
			if(score[i]>100 || score[i]<0) {
				System.out.println("0~100사이 점수로 입력바람!!");
			i--;
			continue; 
			}
 			sum+=score[i];
		}
		avg=(double)sum/score.length;

		System.out.println("입력한 점수들");
		for(int n:score)
			System.out.printf("%5d",n);
		System.out.println("\n총점:"+sum);
		System.out.println("평균:"+avg);

	}

}
