package Bit701.day0905;

import java.util.Scanner;

public class 연습장2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j) {
					System.out.print(i+1);
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
     
	}

}
