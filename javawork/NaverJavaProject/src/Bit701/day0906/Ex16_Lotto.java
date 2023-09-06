package Bit701.day0906;

import java.util.Random;

public class Ex16_Lotto {

	 public static void main(String[] args) {
	        int[] lotto = new int[6];

	        for (int i = 0; i < lotto.length; i++) {
	            int randomNumber = (int) (Math.random() * 45) + 1; // 1부터 45까지의 난수 생성
	            lotto[i] = randomNumber;

	            // 중복 확인 로직
	            for (int j = 0; j < i; j++) {
	                if (lotto[i] == lotto[j]) {
	                    i--;
	                    break; // 중복이 발견되면 현재 반복문을 빠져나간 후 다음 번호를 생성
	                }
	            }
	        }

	        // 정렬 (오름차순)
	        for (int i = 0; i < lotto.length - 1; i++) {
	            for (int j = i + 1; j < lotto.length; j++) {
	                if (lotto[i] > lotto[j]) {
	                    int temp = lotto[i];
	                    lotto[i] = lotto[j];
	                    lotto[j] = temp;
	                }
	            }
	        }

	        // 출력
	        for (int n : lotto) {
	            System.out.printf("%4d", n);
	        }
	    }
	}

