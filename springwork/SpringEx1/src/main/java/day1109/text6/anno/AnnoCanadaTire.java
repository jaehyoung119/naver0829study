package day1109.text6.anno;

import org.springframework.stereotype.Component;

@Component // xml에 자동으로 bean 등록 - 첫글자는 소문자로 클래스명이 id가된다
public class AnnoCanadaTire implements AnnoTire {

	@Override
	public String getTireName() {
		// TODO Auto-generated method stub
		return "어노테이션 캐나다 타이어";
	}

}
