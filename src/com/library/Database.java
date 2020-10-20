package com.library;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Database {
	
		
	
	TreeSet<Book> b;
	
	public Database() {
		
		b=new TreeSet<Book>();
		Book b1=new Book(1,"LetUsC","xyz",499.00);
		Book b2=new Book(2,"JavaEE","pqr",700.00);
		Book b3=new Book(3,"Java","abc",500.00);
		Book b4=new Book(4,"OS","cbi",750.00);
		b.add(b1);
		b.add(b2);
		b.add(b3);
		b.add(b4);
		
	}
	
	
	public void viewAll() {
		
		Iterator<Book> itr=b.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public Book viewByName(String name) {
		
		for(Book b : b) {
			if(b.title.equals(name)) {
				return b;
			}
		}
		return null;
	}
	
	public void insert(Book b1) {
		
		
		b.add(b1);
		System.out.println("Book inserted");
		Iterator<Book> itr=b.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
	
	  public void delete(int bookId) {
		  boolean notFound=true;
		  Iterator<Book> itr=b.iterator();
		  while(itr.hasNext()) {
			  	Book bTemp=itr.next();
			  	if(bTemp.bookId==bookId)
			  { 
			  		notFound=false;
			  		itr.remove();
			  		System.out.println("Book is deleted");
			  		break;
			  		
			  }
		  }	
			  	if(notFound) {
				  System.out.println("No book found");

			  	}
			  	
			  	Iterator<Book> itr1=b.iterator();
				while(itr1.hasNext()) {
					System.out.println(itr1.next());
				}
				 			  
		  }
		  
		
			
			  public void update(int bookId,double price) {
				  boolean notFound=true;
			  Iterator<Book> itr=b.iterator(); 
			  while(itr.hasNext()) 
			  {
				  notFound=false;
				  Book bTemp=itr.next();
			  
				  if(bTemp.bookId==bookId) 
				  { 
					  String title=bTemp.title; 
					  String author=bTemp.author; 
					  itr.remove(); 
					  Book b2 = new Book(bookId,title,author,price); 
					  b.add(b2);
					  System.out.println("Details updated");
					  
				  }
			  }
			  if(notFound==true)  {
					  System.out.println("Wrong book id entered");
					  
				  }
			  Iterator<Book> itr1=b.iterator(); 
			  while(itr1.hasNext()) {
			  System.out.println(itr1.next()); 
			  } 
			  
			} 
	  
	 
	}
		
		

