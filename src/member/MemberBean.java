
package member;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;


public class MemberBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id,pw,name,regDate,gender,ssn,
		profileImg,email,phone; 
	private int birth;
	
	public MemberBean() {}
	
	public MemberBean(String id,String pw,String name,String ssn) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.ssn = ssn;
		String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		this.regDate = now;
		String[] ssnArr = ssn.split("-");
		String[] nowArr = now.split("-");
		int ageResult1 = (Integer.parseInt(ssnArr[0]));
		int genderResult = (Integer.parseInt(ssnArr[1]));
		int ageResult2 = (Integer.parseInt(nowArr[0]));
		int ageResult0 = 0;
		System.out.println("버스+++++"+genderResult);
		switch (genderResult%2) {
		case 1: case 5: 
			this.gender="남"; 
			ageResult0 = ageResult2 - 1900-(ageResult1/10000);
			System.out.println("버스+++++"+ageResult0);
			this.birth = ageResult0;
			break;
		case 3: case 7:
			this.gender="남"; 
			ageResult0 = ageResult2 - 2000-(ageResult1/10000);
			this.birth = ageResult0;
			break;
		case 2: case 6:
			this.gender="여";
			ageResult0 = ageResult2 - 1900-(ageResult1/10000);
			this.birth = ageResult0;
			break;
		case 4: case 8:
			this.gender="여";
			ageResult0 = ageResult2 - 2000-(ageResult1/10000);
			this.birth = ageResult0;
			break;
		default:
			System.out.println("잘못된값이 입력됨");
		}
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate() {
		String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		this.regDate = now;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGenderAndBirth(String ssn) {
		String now = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
		String[] ssnArr = ssn.split("-");
		String[] nowArr = now.split("-");
		int ssnBirth = (Integer.parseInt(ssnArr[0]));
		int ssnGender = (Integer.parseInt(ssnArr[1]));
		int thisYear = (Integer.parseInt(nowArr[0]));
		int age = 0;
		this.ssn = ssn;
		switch (ssnGender) {
		case 1: case 5: 
			this.gender="남"; 
			System.out.println("올해:"+thisYear);
			System.out.println("생년월일:"+ssnBirth);
		//	age = ageResult2 - (1900-(this/10000));
		//  나이를 구하려고 했으나 일단 보류
			this.birth = ssnBirth;
			break;
		case 3: case 7:
			this.gender="남"; 
			this.birth = ssnBirth;
			break;
		case 2: case 6:
			this.gender="여";
			this.birth = ssnBirth;
			break;
		case 4: case 8:
			this.gender="여";
			this.birth = ssnBirth;
			break;
		default:
			System.out.println("잘못된값이 입력됨");
		}
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public int getBirth() {
		return birth;
	}
	

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/* gender 와 birth setter 는 통합함
	 public void setGender(String gender) {
		this.gender = gender;
	}
	*/
	/* gender 와 birth setter 는 통합함
	public void setBirth(int birth) {
		this.birth = birth;
	}
	*/

	@Override
	public String toString() {
		return "학생 [아이디=" + id + ", 비번=****"+ ", 이메일=" + email  + ", 이름=" + name + ", 등록일=" + regDate + ", 성별=" + gender
				+ ", 주민번호=" + ssn + ", 나이=" + birth + "]";
	}
	

}

