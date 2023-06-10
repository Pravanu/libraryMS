package com.LibMS.LibraryDemo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Library")
public class Library {
	
	@Id
	private String MemberId;
	private String Name;
	private String BookCode;
	
	
	public Library() {
	}
	
	public Library(String memberId, String name, String bookCode) {
		super();
		MemberId = memberId;
		Name = name;
		BookCode = bookCode;
	}
	
	public String getMemberId() {
		return MemberId;
	}
	public void setMemberId(String memberId) {
		this.MemberId = memberId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getBookCode() {
		return BookCode;
	}
	public void setBookCode(String bookCode) {
		this.BookCode = bookCode;
	}
	
	
	
}
