package Bit701.day0918;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Bit701.day0915.SwingGibon;

public class Ex3_TableFile extends JFrame {
	JTable table;
	DefaultTableModel model;
	JTextField tfName,tfAge,tfAddr;
	JButton btnAdd;
	//파일 이름 
	final static String FILENAME="D:\\naver0829\\member.txt";
	
	public Ex3_TableFile(String title) {
		super(title); // JFrame 의 문자열을 받는생성자 호출
		this.setLocation(300, 100); //프레임의 시작위치
		this.setSize(300, 300); //프레임의 너비,높이
		// this.getContentPane().setBackground(Color.pink); // Color 상수를 이용해서 벽녕
		this.getContentPane().setBackground(new Color(200,255,180)); // 0~255 rgb
		this.setVisible(true); //true:프레임을 보이게하기, false:프레임숨기기
		
		//디자인이나 이벤트를 구현할 메서드 호출
		this.setDesign();
		
		this.setVisible(true);
		
		//윈도우 이벤트 발생- 익명 내부클래스 형태로 이벤트 구현
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) { //x버튼 클릭시 호출되는 메서드
				// TODO Auto-generated method stub
				//종료전에 테이블의 내용을 member.txt 에 추가하도록 코드 작성
				FileWriter fw = null;
				try {
					fw = new FileWriter(FILENAME);
					//행갯수
					int row = table.getRowCount();
					for(int i=0;i<row;i++) {
						String name=(String) model.getValueAt(i, 0);
						String age=(String) model.getValueAt(i, 1);
						String addr=(String) model.getValueAt(i, 2);
						
						fw.write(name+","+age+","+addr+"\n");
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				//JOptionPane.showMessageDialog(Ex3_TableFile.this,"프레임을 종료합니다");
				//실제종료
				System.exit(0); // 정상종료
				super.windowClosing(e);
			}
		});
	}

	private void setDesign() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel();
		tfName = new JTextField(4);
		tfAge = new JTextField(3);
		tfAddr = new JTextField(5);
		btnAdd = new JButton("추가");
		p.add(new JLabel("이름"));
		p.add(tfName);
		p.add(new JLabel("나이"));
		p.add(tfAge);
		p.add(new JLabel("주소"));
		p.add(tfAddr);
		p.add(btnAdd);
		
		this.add("North",p);
		
		//table 생성
		model = new DefaultTableModel(new String[] {"이름","나이","주소"}, 0);
		table = new JTable(model);
		this.add("Center",new JScrollPane(table));
		
		//버튼 이벤트
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 1. 입력값을 Vector 에 넣는다
				Vector<String> data = new Vector<String>();
				data.add(tfName.getText());
				data.add(tfAge.getText());
				data.add(tfAddr.getText());
				
				// 2. addRow 메서드로 행을 추가한다
				model.addRow(data);
				
				// 3. 입력한값들을 지운다
				tfName.setText("");
				tfAge.setText("");
				tfAddr.setText("");
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3_TableFile s = new Ex3_TableFile("Table-File");
	}

}
