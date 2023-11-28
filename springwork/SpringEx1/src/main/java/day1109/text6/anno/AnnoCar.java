package day1109.text6.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component //id=annoCar
@Component("mycar") //id가 mycar
public class AnnoCar {
	
	//@Autowired //자동주입 에러발생
	//AnnoTire annoTire;
	
	//인터페이스를 구현한 클래스가 여러개인경우 정확하게 클래스명으로 선언
	//유일한 클래스명 에러발생x
	@Autowired
	//AnnoCanadaTire annoTire;
	//AnnoKoreaTire annoTire;
	
	//Resource 는 인터페이스를 구현한 클래스가 여러개일 경우 콕집어서 지정
	@Resource(name = "annoCanadaTire")
	AnnoTire annoTire;
	
	public void myCarInfo() {
		System.out.println("내 차의 타이어는 "+annoTire.getTireName()+"입니다");
	}
}
