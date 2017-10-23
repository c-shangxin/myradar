package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="radar_stu")
public class Stu {
	
	private int sno;
	private String sname;
	private double yuwen;
	private double shuxue;
	private double wuli;
	private double huaxue;
	private double yinwu;
	public Stu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double getYinwu() {
		return yinwu;
	}

	public void setYinwu(double yinwu) {
		this.yinwu = yinwu;
	}

	public Stu(int sno, String sname, double yuwen, double shuxue, double wuli,
			double huaxue, double yinwu) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.yuwen = yuwen;
		this.shuxue = shuxue;
		this.wuli = wuli;
		this.huaxue = huaxue;
		this.yinwu = yinwu;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getYuwen() {
		return yuwen;
	}
	public void setYuwen(double yuwen) {
		this.yuwen = yuwen;
	}
	public double getShuxue() {
		return shuxue;
	}
	public void setShuxue(double shuxue) {
		this.shuxue = shuxue;
	}
	public double getWuli() {
		return wuli;
	}
	public void setWuli(double wuli) {
		this.wuli = wuli;
	}
	public double getHuaxue() {
		return huaxue;
	}
	public void setHuaxue(double huaxue) {
		this.huaxue = huaxue;
	}
	
	
}
