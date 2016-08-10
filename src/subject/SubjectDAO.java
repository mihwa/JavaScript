package subject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;

public class SubjectDAO {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	private static SubjectDAO instance= new SubjectDAO();
	public SubjectDAO() {
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.USER_ID,
					Constants.USER_PW);
					
					
		} catch (Exception e ) {
			e.printStackTrace();
		}
	}
	public static SubjectDAO getInstance() {
		return instance;
	}
	public void insert(SubjectBean sub){
		String sql = "insert ito subject(subj_seq,id,major,subjects)"
				+"values(subj_seq.nextval,?,?,?))";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sub.getMajor());
			pstmt.setString(2, sub.getId());
			pstmt.setString(3, sub.getSubject());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
		if(result==1){
			System.out.println("과목추가성공");
		}else{
			System.out.println("과목추가실패");
		}
	}
			
	public SubjectBean findById(String id){
			SubjectBean s = null;
			String sql ="select "+" id as id, "
			+ "major as major, "
			+ "subjects as sub "
			+ "from subject where id = ?";
		
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				if(rs.next()){
					s = new SubjectBean();
					s.setId(rs.getString("id"));
					s.setMajor(rs.getString("major"));
					s.setSubject(rs.getString("sub"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return s;
		}
	
}