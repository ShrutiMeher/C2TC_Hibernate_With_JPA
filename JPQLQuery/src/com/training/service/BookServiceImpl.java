package com.training.service;

import java.util.List;

import com.training.dao.BookDao;
import com.training.dao.BookDaoImpl;
import com.training.entity.Book;

public abstract class BookServiceImpl implements BookService {

	private BookDao dao;

	public BookServiceImpl() {
		dao = new BookDaoImpl();
	}

	@Override
	public Book getBookById(int id) {
		return dao.getBookById(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) {
		return dao.getBookByTitle(title);
	}

	@Override
	public Long getBookCount() {
		return dao.getBookCount();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		return dao.getAuthorBooks(author);
	}

	@Override
	public List<Book> getAllBooks() {
		return dao.getAllBooks();
	}
	
	@Override
	public List<Book> getBooksInPriceRange(double low, double high){
		return dao.getBooksInPriceRange(low, high);
	}
}
