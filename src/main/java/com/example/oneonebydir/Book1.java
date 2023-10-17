package com.example.oneonebydir;

public class Book1 {
int id;
String book_name;
int no_pages;
String publication;
public Book1(int id, String book_name, int no_pages, String publication) {
	super();
	this.id = id;
	this.book_name = book_name;
	this.no_pages = no_pages;
	this.publication = publication;
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
public int getNo_pages() {
	return no_pages;
}
public void setNo_pages(int no_pages) {
	this.no_pages = no_pages;
}
public String getPublication() {
	return publication;
}
public void setPublication(String publication) {
	this.publication = publication;
}

}
