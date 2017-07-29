package com.freetipscentral.utility;
 
import java.util.ArrayList;
import java.util.List;
 
import com.freetipscentral.domain.Book;
 
public class BookCreator {
 
	public static List<Book> getBooks() {
		List<Book> books = new ArrayList<Book>();
		Book book1 = new Book("Head First Java",1);
		Book book2 = new Book("Head First Design Pattern",2);
		books.add(book1);
		books.add(book2);
		return books;
	}
 
}