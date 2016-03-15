package com.two95.cards;

import java.util.List;

public class CardValue {
	private String val1;
	private String val2;
	private String val3;
	private String val4;
	private String val5;
	private String val6;
	private String val7;
	private String val8;
	private String val9;
	private String val10;
	private String valJACK;
	private String valQUEEN;
	private String valKING;
	private String valACE;
	public CardValue(String val1, String val2, String val3, String val4, String val5, String val6, String val7,
			String val8, String val9, String val10, String valJACK, String valQUEEN, String valKING, String valACE) {
		super();
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
		this.val4 = val4;
		this.val5 = val5;
		this.val6 = val6;
		this.val7 = val7;
		this.val8 = val8;
		this.val9 = val9;
		this.val10 = val10;
		this.valJACK = valJACK;
		this.valQUEEN = valQUEEN;
		this.valKING = valKING;
		this.valACE = valACE;
	}
	public CardValue() {
		
	}
	@Override
	public String toString() {
		return "values are = " + val1 + " , " + val2 + " , " + val3 + " , " + val4 + " , " + val5
				+ " , " + val6 + " , " + val7 + " , " + val8 + " , " + val9 + " , " + val10
				+ " , " + valJACK + " , " + valQUEEN + " , " + valKING + " , " + valACE;
	}
	
	

	
	

}
