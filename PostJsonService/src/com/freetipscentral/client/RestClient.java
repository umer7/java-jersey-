


package com.freetipscentral.client;

import java.util.ArrayList;
import java.util.List;
 
import javax.ws.rs.core.MediaType;
 
import com.freetipscentral.domain.Book;
import com.freetipscentral.domain.Books;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
 
public class RestClient {
	public static void main(String args[]) {
 
		Books books = new Books();
 
		Book book1 = new Book("Head First Java",1);
		Book book2 = new Book("Head First Design Pattern",2);
		Book book3 = new Book("My Experiments With Truth",3);
 
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		books.setBooks(bookList);
		books.setTotalPrice(100);
 
		Client client = Client.create();
		WebResource webResource = client.resource("http://localhost:8080/RestWebService/rest/postJSON");
 
		List<Book> booksFromRest = webResource.type(MediaType.APPLICATION_JSON)
				      .accept(MediaType.APPLICATION_JSON)
				      .post(new GenericType<List<Book>>() {}, books);
		for(Book eachBook : booksFromRest) {
			System.out.println(eachBook);
		}
	}
}
