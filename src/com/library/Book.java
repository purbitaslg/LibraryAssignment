package com.library;

import java.io.Serializable;
import java.util.Scanner;

public class Book implements Comparable<Book> {
	
	int bookId;
	String title;
	String author;
	Double price;

	
	
	public Book() {
		
		//System.out.println("Default constructor");
		
		
		
	}
	
	public Book(int bookId,String title,String author,Double price) {
		
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.price=price;
		
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book arg0) {
		// TODO Auto-generated method stub
		return this.bookId-arg0.bookId;
	}
	
	
	
	
	

}
