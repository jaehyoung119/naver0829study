package Bit701.day0911;

public class Sawon {
    private String name; // 사원명
    private int gibon;   // 기본급
    private int sudang;  // 수당
    private int familySu;// 가족수
    
    //멤버 변수의 4개를 인자로 받아서 전달할 생성자
    public Sawon(String name,int gibon,int sudang,int familySu) {
    	this.name=name;
    	this.gibon=gibon;
    	this.sudang=sudang;
    	this.familySu=familySu;
    }
    
    //멤버변수 4개의 getter method
    public String getName() {
    	return name;
    }
    
    public int getGibon() {
    	return gibon;
    }
    
    public int getSudang() {
    	return sudang;
    }
    
    public int getFamilySu( ) {
    	return familySu;
    }
    
    //가족수에 따른 수당 반환하는 메서드 getFamilySudan
    //3인 이상이면 100000, 나머지는 50000
    public int getFamilySudang() {
		if(familySu>=3) {
			return 100000;
		} else {
			return 50000;
		}
	}
    
    //세금반환하는 메서드 getTax
    //기본급의 5프로 반환 
    public int getTax() {
		return gibon*5/100;
	}
    
    //실제 받을 실수령액을 리턴하는 메서드 getNetPay
    //기본급+수당+가족수당-세금
    public int getNetPay() {
		return gibon+sudang+getFamilySudang()-getTax();
	}
}
