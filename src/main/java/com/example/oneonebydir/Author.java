package com.example.oneonebydir;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name="Author")
public class Author {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String author_name;
String publication;
int pub_year;

@JsonIgnore
@OneToOne(cascade=CascadeType.ALL)
Book book;


public Author() {
	super();
	// TODO Auto-generated constructor stub
}


public Author(int id, String author_name, String publication, int pub_year, Book book) {
	super();
	this.id = id;
	this.author_name = author_name;
	this.publication = publication;
	this.pub_year = pub_year;
	this.book = book;
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAuthor_name() {
	return author_name;
}

public void setAuthor_name(String author_name) {
	this.author_name = author_name;
}

public String getPublication() {
	return publication;
}

public void setPublication(String publication) {
	this.publication = publication;
}

public int getPub_year() {
	return pub_year;
}

public void setPub_year(int pub_year) {
	this.pub_year = pub_year;
}

public Book getBook() {
	return book;
}

public void setBook(Book book) {
	this.book = book;
}

}
