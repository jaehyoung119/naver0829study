package Bit701.day0904;

public class Ex1_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		 /* 
		  * 반복문에는 for,while,do~while 3가지가 ㅣㅇㅆ다
		  * for문은 주로 반복횟수가 정해져있는경우에 많이 사용
		  * while 이나 do~while 은 반복횟수가 정해져있지 않은 경우에 많이 사용
		  * while 과 do~while 차이점은 조건을 먼저주느냐, 나중에 주느냐 차이
		  */
		
		int a=65; // 대문자 A의 아스키코드 값
		while(a<=90) {// 91이 되면 빠져나가는
//		     System.out.print((char)a);
//		     a++;
			
			//위의 코드를 한줄로 줄여보세요
			System.out.print((char)a++);
		}
		System.out.println();
		System.out.println("빠져나온후에 a값"+a);
		
		a=65;
		while(true) {
			System.out.print((char)a++);
			if(a>90) {
				break;
			}
		}
		System.out.println();
		a=65;
		do {
			System.out.print((char)a++);
		}while(a<=90); // 조건뒤에 반드시 ;추가
		System.out.println();
		
		int n=10;
//		while(n<10) { //조건이 거짓이면 실행안됌
//			System.out.print(n--);
//		}
		
        // do while 은 무조곤 한번은 실행
		do {
			System.out.print(n--);
			if(n==0)
				break;
		} while(n<10);
	}

}
