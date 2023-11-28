package Bit701.day0925;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import db.DbConnect;

public class Ex7_sawonCrud {
	DbConnect db = new DbConnect();
	Scanner sc = new Scanner(System.in);
	
	public void seletAll() {
		System.out.println("번호\t사원명\t점수\t성별\t부서");
		System.out.println("=".repeat(40));
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		String sql="select * from sawon order by num";
		conn = db.getMysqlConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt("num");
				String name = rs.getString("name");
				int score = rs.getInt("score");
				String gender=rs.getString("gender");
				String buseo = rs.getString("buseo");
				System.out.println(num+"\t"+name+"\t"+score+"\t"+gender+"\t"+buseo);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.dbClose(rs, pstmt, conn);
		}
	}
	
	public void insertSawon() {
		System.out.println("이름");
		String name = sc.nextLine();
		System.out.println("점수");
		int score=Integer.parseInt(sc.nextLine());
		System.out.println("성별");
		String gender = sc.nextLine();
		System.out.println("부서");
		String buseo = sc.nextLine();
		
		String sql="insert into sawon (name,score,gender,buseo) values (?,?,?,?)";
		//?에 값을 넣는것: 바인딩, ?는 차례대로 1,2,3,4,..
		
		Connection conn = db.getMysqlConnection();
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql); // 이때 sql문을 검사
			//? 갯수만큼 값을 넣어준다
			pstmt.setString(1, name);
			pstmt.setInt(2, score);
			pstmt.setString(3, gender);
			pstmt.setString(4, buseo);
			//실행
			pstmt.execute(); // 주의 sql문 없다
			System.out.println("사원정보를 추가하였습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public void deleteSawon() {
		System.out.println("삭제할 사원의 이름은?");
		String name = sc.nextLine();
		
		Connection conn = db.getMysqlConnection();
		PreparedStatement pstmt = null;
		
		String sql = "delete from sawon where name=?";
		try {
			pstmt=conn.prepareStatement(sql);
			//? 갯수만큼 바인딩
			pstmt.setString(1, name);
			
			int n = pstmt.executeUpdate();
			if(n==0)
				System.out.println("사원은 명단에 없습니다");
			else
				System.out.println(n+"명의 사원정보를 삭제하였습니다");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}
	
	public void updateSawon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사원번호를 입력하세요");
		String num=sc.nextLine();
		System.out.println("점수");
		int score = Integer.parseInt(sc.nextLine());
		System.out.println("부서");
		String buseo = sc.nextLine();
		
		String sql="update sawon set score =?,buseo=? where num=?";
		System.out.println(sql);
		
		Connection conn=db.getMysqlConnection();
		PreparedStatement pstmt=null;
		
    	try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, score);
			pstmt.setString(2, buseo);
			pstmt.setString(3, num);
			int n = pstmt.executeUpdate();
			
			if(n==0)
				System.out.println("해당 데이타 존재하지 않음");
			else
				System.out.println("해당 데이타를 수정하였습니다");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(pstmt, conn);
		}
	}

	public int getMenu() {
		int menu=0;
		System.out.println("1.추가  2.삭제  3.수정  4.전체조회  5.종료");
		menu=Integer.parseInt(sc.nextLine());
		return menu;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex7_sawonCrud ex = new Ex7_sawonCrud();
		
		while(true) {
			int menu = ex.getMenu();
			switch(menu) {
			case 1:
				ex.insertSawon();
				break;
			case 2:
				ex.deleteSawon();
			case 3:
				ex.updateSawon();
				break;
			case 4:
				ex.seletAll();
				break;
		    default :
		    	System.out.println("시스템을 종료합니다");
		    	System.exit(0);
			}
			System.out.println("-".repeat(30));
		}
	}

}
