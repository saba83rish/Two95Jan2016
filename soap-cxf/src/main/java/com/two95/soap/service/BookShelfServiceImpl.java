package com.two95.soap.service;

import javax.jws.WebService;

import com.two95.soap.vo.BookVO;

@WebService(endpointInterface = "com.two95.soap.service.BookShelfService",serviceName="bookShelfService")
public class BookShelfServiceImpl implements BookShelfService {

	@Override
	public String insertBook(BookVO bookVO) {
		return "Inserted the Book " + bookVO.getBookName() + " succesfully.";
	}

	@Override
	public BookVO getBook(String title) {
		BookVO book = new BookVO();
		book.setBookId(1234);
		book.setBookName(title);
		System.out.println("Created the book with Id = "+book.getBookId());
		return book;
	}

}
