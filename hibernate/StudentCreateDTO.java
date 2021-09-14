package com.at.assignments;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table
public class StudentCreateDTO {
	@Id
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator = "auto")
	private int id;
	private String sName;
	private String sStream;
	private double sPer;
    private Long sPhone;
  //  private String sAddr;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsStream() {
		return sStream;
	}
	public void setsStream(String sStream) {
		this.sStream = sStream;
	}
	public double getsPer() {
		return sPer;
	}
	public void setsPer(double sPer) {
		this.sPer = sPer;
	}
	public Long getsPhone() {
		return sPhone;
	}
	public void setsPhone(Long sPhone) {
		this.sPhone = sPhone;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public int getsAddr() {
		return sAddr;
	}
	public void setsAddr(int sAddr) {
		this.sAddr = sAddr;
	}
	private int sAge;
    private int sAddr;
}


