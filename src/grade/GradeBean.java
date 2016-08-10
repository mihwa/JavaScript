package grade;

import java.io.Serializable;

public class GradeBean implements Serializable{
	private static final long serialVersionUID=1L;
	private String id,grade,seq,examDate, subject,major;
	private int java,sql,html,javascript, score;
	
	public String getSubject() {
		return subject;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getExamDate() {
		return examDate;
	}
	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getSql() {
		return sql;
	}
	public void setSql(int sql) {
		this.sql = sql;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getJavascript() {
		return javascript;
	}
	public void setJavascript(int javascript) {
		this.javascript = javascript;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "성적표 [No." + seq + ",아이디 :" + id + ", 학점 :" + grade + "\n"
				+ "  자바 : " + java + ", SQL : " + sql
				+ ", HTML5 : " + html + ", 자바스크립트 : " + javascript + "]";
	}
}
