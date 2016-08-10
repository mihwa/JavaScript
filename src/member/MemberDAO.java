package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;

public class MemberDAO {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs; // executeQuery() 에서만 리턴받는 객체
	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return instance;
	}

	private MemberDAO() {
		con = DatabaseFactory.createDatabase(Vendor.ORACLE, Constants.USER_ID, Constants.USER_PW).getConnection();
	}
	public int insert(MemberBean mem){
		int result = 0;
		String sql = "insert into member(id,pw,name,reg_date,ssn,email,profile_img,phone)"
				+ "values(?,?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mem.getId());
			pstmt.setString(2, mem.getPw());
			pstmt.setString(3, mem.getName());
			pstmt.setString(4, mem.getRegDate());
			pstmt.setString(5, mem.getSsn());
			pstmt.setString(6, mem.getEmail());
			pstmt.setString(7, "default.jpg");
			pstmt.setString(8, mem.getPhone());
			result = pstmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result==1) {
			System.out.println("DAO에서 가입 성공");
		} else {
			System.out.println("DAO에서 가입 실패");	
		}
		return exeUpdate(sql);
	}
	public int update(MemberBean mem){
		String sql = "update member"
				+ " set pw = ? , email = ?"
				+ " where id = ?";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mem.getPw());
			pstmt.setString(2, mem.getEmail());
			pstmt.setString(3, mem.getId());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result==1) {
			System.out.println("DAO에서 수정 성공");
		} else {
			System.out.println("DAO에서 수정 실패");	
		}
		return result;
		
	}

	public int exeUpdate(String sql) {
		int result = 0;
		try {
			stmt = con.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (result==0) {
			System.out.println("성공");
		} else {
			System.out.println("실패");	
		}
		
		return result;
		
		
	}
	// list
	public List<MemberBean> list() {
		String sql="select * from member ";
		List<MemberBean>list = new ArrayList<MemberBean>();
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				MemberBean temp = new MemberBean();
				temp.setId(rs.getString("ID"));
				temp.setPw(rs.getString("PW"));
				temp.setName(rs.getString("NAME"));
				temp.setEmail(rs.getString("EMAIL"));
				temp.setGenderAndBirth(rs.getString("SSN"));
				temp.setRegDate(rs.getString("REG_DATE"));
				temp.setProfileImg(rs.getString("PROFILE_IMG"));
				temp.setProfileImg(rs.getString("PHONE"));	
				
				list.add(temp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return list;
	}
	// findByPK
	public MemberBean findById(String pk) {
		String sql = "select * from member where id = ?";
		MemberBean temp = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,pk);	
			rs = pstmt.executeQuery();
			if(rs.next()){
				temp.setId(rs.getString("ID"));
				temp.setPw(rs.getString("PW"));
				temp.setName(rs.getString("NAME"));
				temp.setEmail(rs.getString("EMAIL"));
				temp.setGenderAndBirth(rs.getString("SSN"));
				temp.setRegDate(rs.getString("REG_DATE"));
				temp.setProfileImg(rs.getString("PROFILE_IMG"));
				temp.setProfileImg(rs.getString("PHONE"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	// findByNotPK
	public List<MemberBean> findByName(String name) {
		String sql = "select * from member where name ='"+name+"'";
		
		return null;
	}
	// count
	public int count() {
		String sql = "select count(*) as count from member";
		int count = 0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.USER_ID,
					Constants.USER_PW
					);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				count = rs.getInt("count");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	public int delete(MemberBean member) {
		String sql = "delete from member where id=? and pw = ?";
		int result = 0;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPw());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (result == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		return result;
	}

	public boolean login(MemberBean param) {
		boolean loginOk= false;
		if(param.getId()!=null 
				&& param.getPw()!=null 
				&&existId(param.getId())){
			MemberBean member = this.findById(param.getId());
			if(member.getPw().equals(param.getPw())){
				loginOk = true;
			}
		}
		System.out.println("LOGIN_OK ?"+loginOk);
		return loginOk;
	}
	public boolean existId(String id){
		boolean existOK = false;
		String sql = "select count(*) as count from member where id = ?";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				result = rs.getInt("count");
				System.out.println("ID 카운트 결과:"+result);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result == 1){
			existOK = true;
		}
		return existOK;
	}
}










