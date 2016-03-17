package com.java.dao.practice;

public class Library {
	private int memberId;
	private String memberLastName;
	private String memberFirstName;
	private String memberAddress;
	
	public Library(){
		
	}
	public Library(int memberId, String memberLastName, String memberFirstName, String memberAddress) {
		super();
		this.memberId = memberId;
		this.memberLastName = memberLastName;
		this.memberFirstName = memberFirstName;
		this.memberAddress = memberAddress;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberLastName() {
		return memberLastName;
	}
	public void setMemberLastName(String memberLastName) {
		this.memberLastName = memberLastName;
	}
	public String getMemberFirstName() {
		return memberFirstName;
	}
	public void setMemberFirstName(String memberFirstName) {
		this.memberFirstName = memberFirstName;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	
	

}
