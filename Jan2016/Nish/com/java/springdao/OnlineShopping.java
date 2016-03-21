package com.java.springdao;

public class OnlineShopping {
	private int itemID;
	private String itemName;
	private double itemPrice;
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	@Override
	public String toString() {
		return "OnlineShopping [itemID=" + itemID + ", itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
	}
	
	

}
