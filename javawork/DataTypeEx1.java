public class DataTypeEx1{
          public static void main(String[] args)
   { 
        //byte 는 -128~127까지 정수표현 가능

        byte a =(byte)127;
        System.out.println("a="+a);
        byte b=(byte)200; // 오류 발생, 강제 형변황
        System.out.println("b="+b); // 강제형 변환했을경우 값손실 발생

            // 실행시 인자로 넘어오는 문자열을 확인해보자
             System.out.println(args[0]);// 배열의 첫 문자열 출력
  }
}