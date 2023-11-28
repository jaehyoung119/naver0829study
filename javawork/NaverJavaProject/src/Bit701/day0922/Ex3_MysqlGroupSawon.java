package Bit701.day0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex3_MysqlGroupSawon {
	static final String MYSQL_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String MYSQL_URL="jdbc:mysql://localhost:3306/bit701?serverTimezone=Asia/Seoul";

	Ex3_MysqlGroupSawon(){
		try {
			Class.forName(MYSQL_DRIVER);
			//System.out.println("Mysql 드라이버 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("Mysql 드라이버 실패:"+e.getMessage());
		}
	}
	
	public void sawonBunseok()
	{
		Connection conn = null;
	    Statement stmt = null;
	    ResultSet rs = null;//select 일 경우만 필요.
		String sql="select buseo,count(*) count,max(score) maxscore,"
				+ "min(score) minscore,avg(score) avgscore from sawon group by buseo";
		 try {
	         conn = DriverManager.getConnection(MYSQL_URL,"root","1234");
	         System.out.println("Mysql 연결 성공!!!");
	         
	         stmt = conn.createStatement();
	         rs=stmt.executeQuery(sql);

	         System.out.println("부서\t총인원수 최고점\t최저점\t평균점수");
	         System.out.println("=".repeat(40));
	         
	         int total = 0;
	         while (rs.next()) {
	            String buseo = rs.getString("buseo");
	            int count = rs.getInt("count");
	            int maxScore = rs.getInt("maxScore");
	            int minScore = rs.getInt("minScore");
	            double avgScore = rs.getDouble("avgScore");

	            
	            System.out.println(buseo + "\t" + count + "\t" + maxScore
	            		+ "\t" + minScore + "\t" +avgScore );
	            
	         }
	      
	      } catch (SQLException e) {
	         System.out.println("Mysql 연결 실패!!!" + e.getMessage());
	      } finally {
	         try {
	            rs.close();
	            stmt.close();
	            conn.close();
	         } catch (SQLException | NullPointerException e) {
	            e.printStackTrace();
	         }
	      }
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3_MysqlGroupSawon ex=new Ex3_MysqlGroupSawon();
		ex.sawonBunseok();
	}

}