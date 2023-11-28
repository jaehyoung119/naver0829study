package day1109.text6.anno;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component("mycar2")
@AllArgsConstructor
public class AnnoCar2 {

	AnnoKoreaTire koreaTire;
	AnnoCanadaTire canadaTire;
	
	public void myCarInfo() {
		System.out.println("내차의 타이어는"+koreaTire.getTireName());
		System.out.println("내차의 타이어는"+canadaTire.getTireName());
	}

}
