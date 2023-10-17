package com.example.oneonebydir;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name="Book")
public class Book {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String book_name;
String book_price;
int no_pages;



@OneToOne(cascade=CascadeType.ALL)
Author author;

public Book() {
	super();
	// TODO Auto-generated constructor stub
}

public Book(int id, String book_name, String book_price, int no_pages, Author author) {
	super();
	this.id = id;
	this.book_name = book_name;
	this.book_price = book_price;
	this.no_pages = no_pages;
	this.author = author;
}



public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBook_name() {
	return book_name;
}

public void setBook_name(String book_name) {
	this.book_name = book_name;
}

public String getBook_price() {
	return book_price;
}

public void setBook_price(String book_price) {
	this.book_price = book_price;
}

public int getNo_pages() {
	return no_pages;
}

public void setNo_pages(int no_pages) {
	this.no_pages = no_pages;
}

public Author getAuthor() {
	return author;
}

public void setAuthor(Author author) {
	this.author = author;
}


}
