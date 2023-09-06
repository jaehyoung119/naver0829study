package Bit701.day0906;

import java.util.Random;

public class Ex15_ArrayJungbok {
    public static void main(String[] args) {
        Random r = new Random();
        int[] data = new int[10];

        Loop:
        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(20) + 1;
            
            // 중복 확인 로직
            for (int j = 0; j < i; j++) {
                if (data[i] == data[j]) {
                    i--; // 중복이 발견되면 현재 인덱스를 다시 검사
                    continue Loop;
                }
            }
        }

        // 출력 (한 줄에 5개의 숫자를 출력)
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%4d", data[i]);
            if ((i + 1) % 5 == 0)
                System.out.println();
        }
    }
}