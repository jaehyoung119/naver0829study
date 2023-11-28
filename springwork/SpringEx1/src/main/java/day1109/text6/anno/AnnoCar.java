package day1109.text6.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component //id=annoCar
@Component("mycar") //id�� mycar
public class AnnoCar {
	
	//@Autowired //�ڵ����� �����߻�
	//AnnoTire annoTire;
	
	//�������̽��� ������ Ŭ������ �������ΰ�� ��Ȯ�ϰ� Ŭ���������� ����
	//������ Ŭ������ �����߻�x
	@Autowired
	//AnnoCanadaTire annoTire;
	//AnnoKoreaTire annoTire;
	
	//Resource �� �������̽��� ������ Ŭ������ �������� ��� ����� ����
	@Resource(name = "annoCanadaTire")
	AnnoTire annoTire;
	
	public void myCarInfo() {
		System.out.println("�� ���� Ÿ�̾�� "+annoTire.getTireName()+"�Դϴ�");
	}
}
