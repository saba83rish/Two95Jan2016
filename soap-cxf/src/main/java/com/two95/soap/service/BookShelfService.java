package com.two95.soap.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.two95.soap.vo.BookVO;

@WebService
public interface BookShelfService {
	
	@WebMethod
	public  String insertBook(BookVO bookVO);

	@WebMethod
	public  BookVO getBook(String title);

}
