package day19;

import java.util.*;
import java.util.Date;
import java.sql.*;
public class Member { // VO 클래스에서는 따로 생성자를 만들지 않는다.
	private String name, id, pw, addr, tel, mail, gen, birth, jdate;
	private Date bdate, joinDate;
	private Time btime, joinTime;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public Time getBtime() {
		return btime;
	}
	public void setBtime(Time btime) {
		this.btime = btime;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", pw=" + pw + ", addr=" + addr + ", tel=" + tel + ", mail="
				+ mail + ", gen=" + gen + ", birth=" + birth + ", jdate=" + jdate + ", bdate=" + bdate + ", joinDate="
				+ joinDate + ", btime=" + btime + ", joinTime=" + joinTime + "]";
	}
}
