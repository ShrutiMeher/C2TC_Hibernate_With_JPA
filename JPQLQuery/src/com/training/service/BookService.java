package com.training.service;

import java.awt.print.Book;

import java.util.List;

public interface BookService {

		public abstract Book getBookById(int id);
		
		public abstract List<Book> getBookTitle(String title);
		
		public abstract Long getBookCount();
		
		public abstract List<com.training.entity.Book> getAuthorBooks(String author);
		
		public abstract List<Book> getAllBooks();
		
		public abstract List<Book> getBookInPriceRange(double low, double high);
		
}
