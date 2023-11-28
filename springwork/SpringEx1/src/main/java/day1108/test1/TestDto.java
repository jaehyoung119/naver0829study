package day1108.test1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@Setter
//@Getter
//@ToString

//���� 3���� ������̼��� �ϳ��� ������̼����� ǥ�������ϴ�
@Data

@NoArgsConstructor //����Ʈ ������
@AllArgsConstructor //��� ����� ���ڷ� ���� ������
@RequiredArgsConstructor //�ʿ��� ���ڸ� �����ڷ� 
public class TestDto {
	@NonNull
	private String name;
	private String addr;
	private int age;
}
