package Bit701.day0830;

import java.util.jar.Attributes.Name;

public class DataEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("\tapple\t");	
	System.out.println("banana\t");
	System.out.println("orange\n");
	
	//printf:변환기호에 의한 출력, 정수:%d 실수:%f 문자:%c 문자열:%s
    int age = 23;
    double weight= 56.7;
    char blood = 'A';
    String name="김재형";
    	System.out.printf("이름:%s\n",name);
        System.out.printf("나이:%d세\n",age);
        System.out.printf("몸무가:%fkg\n",weight);
        System.out.printf("몸무게:%3.1fkg\n",weight);//%5.1f:전체자리수:5 소숫점자리수:1
        System.out.printf("혈액형:%c형\n",blood);
        System.out.println("--------------------------");
        System.out.printf("이름:%s\n혈액형:%c\n나이;%d세\n",name,blood,age);
           
      }
}
