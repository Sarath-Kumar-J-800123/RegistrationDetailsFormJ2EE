package com.registrationmodel.in;

public class RegistrationDetailsModel {
	private int rid;
	private String rname;
	private String remail;
	private String rpassword;
	private long mobile;
	private String gender;
	private String city;
	public RegistrationDetailsModel(String rname, String remail, String rpassword, long mobile, String gender,
			String city) {
		super();
		this.rname = rname;
		this.remail = remail;
		this.rpassword = rpassword;
		this.mobile = mobile;
		this.gender = gender;
		this.city = city;
	}
	public RegistrationDetailsModel(int rid, String rname, String remail, String rpassword, long mobile, String gender,
			String city) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.remail = remail;
		this.rpassword = rpassword;
		this.mobile = mobile;
		this.gender = gender;
		this.city = city;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRemail() {
		return remail;
	}
	public void setRemail(String remail) {
		this.remail = remail;
	}
	public String getRpassword() {
		return rpassword;
	}
	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
