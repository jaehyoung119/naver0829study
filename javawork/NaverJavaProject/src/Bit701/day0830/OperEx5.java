package Bit701.day0830;

public class OperEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 증감 연산자 : ++(1씩 증가). --(1씩 감소)
		// 변수 앞에 붙일경우(전치) 1순위
		// 변수 뒤에 붙일경우(후치) 끝순위
		// 단, 단항으로 사용할경우 상관없다
		
	    int a=5;
	    int b=5;
	    ++a;//1증가 
	    System.out.println(a); // 6
	    b++;//1증가
	    System.out.println(b); // 6
	    System.out.println(++a); // 7
	    System.out.println(b++); // 6 출력후 증가
	    System.out.println("a="+a+",b="+b); // 7,7
	    
	    a=b=5;
	    int m=++a;
	    int n=b++;
	    System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,m,n);
	}

}
