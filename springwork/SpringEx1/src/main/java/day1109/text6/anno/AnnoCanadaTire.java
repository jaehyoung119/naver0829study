package day1109.text6.anno;

import org.springframework.stereotype.Component;

@Component // xml�� �ڵ����� bean ��� - ù���ڴ� �ҹ��ڷ� Ŭ�������� id���ȴ�
public class AnnoCanadaTire implements AnnoTire {

	@Override
	public String getTireName() {
		// TODO Auto-generated method stub
		return "������̼� ĳ���� Ÿ�̾�";
	}

}
