package com.bipandeng.bean;

import java.util.Date;

public class Book {

	
	private Integer bid;
	private String bname;
	private String bdesc;
	private String bcname;
	private String product;
	private String address;
	private Double price;
 	private String bctime; 
	private String bjtime;
	private Integer status; 
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	private String log;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBdesc() {
		return bdesc;
	}
	public void setBdesc(String bdesc) {
		this.bdesc = bdesc;
	}
	public String getBcname() {
		return bcname;
	}
	public void setBcname(String bcname) {
		this.bcname = bcname;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getBctime() {
		return bctime;
	}
	public void setBctime(String bctime) {
		this.bctime = bctime;
	}
	public String getBjtime() {
		return bjtime;
	}
	public void setBjtime(String bjtime) {
		this.bjtime = bjtime;
	}
	
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public Book(Integer bid, String bname, String bdesc, String bcname, String product, String address, Double price,
			String bctime) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bdesc = bdesc;
		this.bcname = bcname;
		this.product = product;
		this.address = address;
		this.price = price;
		this.bctime = bctime;
	}
	
	
}
