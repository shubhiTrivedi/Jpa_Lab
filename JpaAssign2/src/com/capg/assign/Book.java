package com.capg.assign;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Book extends Author{
	
	
	@Column(length=20)
	private String isbn;
	
	@Column(name="title", length=20)
	private String title;
	private int price;
	
	public Book(){
	}
	
	public Book(int id, String name,String isbn,String title,int price) {
		super(id, name);
		this.isbn=isbn;
		this.title=title;
		this.price=price;
		
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price
				+  super.toString() + "]";
	}

	
	
	

	
}
