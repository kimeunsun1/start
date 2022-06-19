package githrd.vo;

import java.util.Date;

public class MemberVO {
	private int mno, avt;
	private String name, id, pw, mail, tel;
	private char gen;
	private Date joinadate;
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getAvt() {
		return avt;
	}
	public void setAvt(int avt) {
		this.avt = avt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getJoinadate() {
		return joinadate;
	}
	public void setJoindate(Date joindate) {
		this.joinadate = joindate;
	}
	@Override
	public String toString() {
		return "MemberVO [mno=" + mno + ", avt=" + avt + ", name=" + name + ", id=" + id + ", pw=" + pw + ", mail="
				+ mail + ", tel=" + tel + ", gen=" + gen + ", joinadate=" + joinadate + "]";
	}
	
}
