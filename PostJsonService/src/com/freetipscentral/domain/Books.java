package com.freetipscentral.domain;
 
import java.util.List;
 
public class Books {
 
	List<Book> books;
	int totalPrice;
 
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
 
 
}