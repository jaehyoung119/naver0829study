package Bit701.day0915;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex4_SwingButton extends JFrame {
	JButton btn1,btn2,btn3;
	
	public  Ex4_SwingButton(String title) {
		super(title); // JFrame 의 문자열을 받는생성자 호출
		this.setLocation(300, 100); //프레임의 시작위치
		this.setSize(300, 300); //프레임의 너비,높이
		// this.getContentPane().setBackground(Color.pink); // Color 상수를 이용해서 벽녕
		this.getContentPane().setBackground(new Color(200,255,180)); // 0~255 rgb
		
		
		//디자인이나 이벤트를 구현할 메서드 호출
		this.setDesign();
		
		this.setVisible(true);//true:프레임을 보이게하기, false:프레임숨기기
		
		//윈도우 이벤트 발생- 익명 내부클래스 형태로 이벤트 구현
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { //x버튼 클릭시 호출되는 메서드
				// TODO Auto-generated method stub
				//JOptionPane.showMessageDialog(Ex4_SwingButton.this,"프레임을 종료합니다");
				//실제종료
				System.exit(0); // 정상종료
				super.windowClosing(e);
			}
		});
	}
	
	//버튼 이벤트를 이번에는 내부클래스로 만들어보자
	class MyColorButoon implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==btn1)
				Ex4_SwingButton.this.getContentPane().setBackground(Color.orange);
			else
				Ex4_SwingButton.this.getContentPane().setBackground(Color.pink);
			
		}
	}
	private void setDesign() {
		//자바에서 제공하는 레이아웃을 안쓰고 직접 위치지정을 할경우
		this.setLayout(getLayout());
		
		//버튼 1 생성
		btn1=new JButton("오렌지색");
		btn1.setBounds(20,50,100,50); //x좌표 y좌표 witdh height
		this.add(btn1);
		
		//버튼 2 생성
		btn2=new JButton("핑크색");
		btn2.setBounds(130,50,100,50); //x좌표 y좌표 witdh height
		this.add(btn2);
		
		//버튼 1,2는 내쿠블래스 MyColorButton 의 이벤트를 호출해보자
		btn1.addActionListener(new MyColorButoon());
		btn2.addActionListener(new MyColorButoon());
		
		//버튼 3 생성
		btn3 = new JButton("버튼글자&배경색변경");
		btn3.setBounds(40,130,180,50);
		this.add(btn3);
		
		//버튼3은 익명내부클래스 형태로 만들어보자
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btn1.setBackground(Color.pink);
				btn1.setForeground(Color.DARK_GRAY);
				
				btn2.setBackground(Color.CYAN);
				btn2.setForeground(Color.black);
				
				btn3.setBackground(Color.YELLOW);
				btn3.setForeground(Color.green);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4_SwingButton s = new Ex4_SwingButton("이벤트연습");
	}

}


