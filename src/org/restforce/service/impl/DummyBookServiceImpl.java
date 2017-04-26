package org.restforce.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.restforce.api.Book;
import org.restforce.service.BookService;

public class DummyBookServiceImpl implements BookService{

	List<Book> books = new ArrayList<Book>();
	
	{
		Book book1 = new Book(1, "Book1", "Author1");
		Book book2 = new Book(2, "Book2", "Author2");
		Book book3 = new Book(3, "Book3", "Author3");
		Book book4 = new Book(4, "Book4", "Author4");
		Book book5 = new Book(5, "Book5", "Author5");
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
	}
	
	@Override
	public List<Book> getAllBooks() {
		
		return books;
	}
	
	

}
