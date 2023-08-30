package Bit701.day0830;

public class AskiiEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //char, int 는 같은 타입이라고 봐도 무방
	 char a1 = 65;
	 int  a2 = 'B';
	 System.out.println(a1); // A
	 System.out.println(a2); // 66
	 System.out.println((int)a1); //65
	 System.out.println((char)a2); //B
	 
	 System.out.printf("%d 의 아스키문자는 %c 이다\n",(int)a1,a2);
	 
	 char b1='C';
	 int b2= 68;
	 System.out.println(b1);
	 System.out.println(b2);
	 System.out.println(b1+1); //묵시적 형변환에 의해서 char+int = int(E가 아니라 69)
	 /*
	  *  묵시적 형변환(+는 실제 더하기만 의미하는게 아닌 연산을 의미)
	  *  char + int = int
	  *  int + int = int
	  *  double + int = double
	  *  String + int = String
	  *  String + double = String
	  */
	 
	 // print 나 println 은 모든타입 출력 가능
	 // 이유는 타입별로 여러개를 같은 이름으로 만들어놨음
	 // 이런 method 를 중복함수(overloding method) 라고 부른다.
	 System.out.println((char)(b1+2)); // b1+2 = 69 int 를 char로 강제 형변환
	 System.out.println(5/2); // 2 (int,int)
	 System.out.println(5.0/2); // 2.5 (double,int)
	 System.out.println((double)5/2); // 2.5 (double,int)
	 System.out.println((double)(5/2)); // 2.0 (괄호부터 계산후 double 2 가 된상황)
	 
	 
	}
	
}
