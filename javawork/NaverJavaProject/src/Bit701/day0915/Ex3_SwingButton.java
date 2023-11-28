package Bit701.day0915;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ex3_SwingButton extends JFrame implements ActionListener{
	JButton btn1,btn2;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			System.out.println("버튼1 클릭");
			this.getContentPane().setBackground(Color.red);
		} else {
			System.out.println("버튼2 클릭");
			this.getContentPane().setBackground(Color.pink);
		}
	}
	
	public  Ex3_SwingButton(String title) {
		super(title); // JFrame 의 문자열을 받는생성자 호출
		this.setLocation(300, 100); //프레임의 시작위치
		this.setSize(300, 300); //프레임의 너비,높이
		// this.getContentPane().setBackground(Color.pink); // Color 상수를 이용해서 벽녕
		//this.getContentPane().setBackground(new Color(200,255,180)); // 0~255 rgb
		
		
		//디자인이나 이벤트를 구현할 메서드 호출
		this.setDesign();
		
		this.setVisible(true);//true:프레임을 보이게하기, false:프레임숨기기
		
		//윈도우 이벤트 발생- 익명 내부클래스 형태로 이벤트 구현
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { //x버튼 클릭시 호출되는 메서드
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(Ex3_SwingButton.this,"프레임을 종료합니다");
				//실제종료
				System.exit(0); // 정상종료
				super.windowClosing(e);
			}
		});
	}

	private void setDesign() {
		// TODO Auto-generated method stub
		btn1=new JButton("버튼 #1");// 버튼생성
		//프레임에 추가
		this.add(btn1,"South");
		
		//버튼2
		btn2 = new JButton("버튼 #2");
		this.add(btn2,"North");
		
		//버튼 1,2에 이벤트가 발생되도록 추가해보자
		btn1.addActionListener(this); //()의 this 는 이벤트 메서드가 구현된 클래스의 인스턴스
		btn2.addActionListener(this); //둘다 같은 이벤트 메서드가 호출된다
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3_SwingButton s = new Ex3_SwingButton("버튼");
	}

}


