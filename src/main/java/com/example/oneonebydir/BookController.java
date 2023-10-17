package com.example.oneonebydir;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
@Autowired
BookRepository brepo;
@Autowired
AuthorRepository arepo;

@RequestMapping("/saveall")
public String saveall()
{
	Book b=new Book();
	b.setBook_name("Mathametics(volume-1)");
	b.setBook_price("600");
	b.setNo_pages(890);
	Author a=new Author();
	a.setAuthor_name("rs agarwal");
	a.setPub_year(2017);
	a.setPublication("bharti bhawan");
	b.setAuthor(a);
	a.setBook(b);
	
	Book b1=new Book();
	b1.setBook_name("Holy Faith science-3");
	b1.setBook_price("250");
	b1.setNo_pages(534);
	Author a1=new Author();
	a1.setAuthor_name("suchita verma");
	a1.setPub_year(2012);
	a1.setPublication("ABC publication");
	b1.setAuthor(a1);
	a1.setBook(b1);
	
	Book b2=new Book();
	b2.setBook_name("Ramayan Granth");
	b2.setBook_price("675");
	b2.setNo_pages(4000);
	Author a2=new Author();
	a2.setAuthor_name("Maharishi Tulsidas");
	a2.setPub_year(500);
	a2.setPublication("Gyan Bharti");
	b2.setAuthor(a2);
	a2.setBook(b2);
	
	Book b3=new Book();
	b3.setBook_name("Mathametics volume-2");
	b3.setBook_price("575");
	b3.setNo_pages(688);
	Author a3=new Author();
	a3.setAuthor_name("Kc Sinha");
	a3.setPub_year(2014);
	a3.setPublication("Danpatrai publication");
	b3.setAuthor(a3);
	a3.setBook(b3);
	
	List<Book> list=Arrays.asList(b,b1,b2,b3);
	brepo.saveAll(list);
	 
	return "Data Saved................!";
}
@RequestMapping("/all")
public List<Book> all()
{
	return brepo.findAll();
}
@RequestMapping("/findall")
public List<Author> findall()
{
	return arepo.findAll();
}
/*@RequestMapping("/new/{id}")
public Book byid(@PathVariable int id)
{
	return brepo.findById(id);
}*/
@RequestMapping("/getby/{id}")

public Book1 getby(@PathVariable int id)
{
	return brepo.selectFromId(id);
}

@RequestMapping("/{id:[0-2]}")
public Book ad(@PathVariable int id)
{
	return  brepo.findById(id);
}
}
