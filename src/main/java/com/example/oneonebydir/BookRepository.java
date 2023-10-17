package com.example.oneonebydir;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book,Integer>
{
     Book findById(int id);
     
    
     @Query("select new com.example.oneonebydir.Book1(b.id,b.book_name,b.no_pages,b.author.publication)from Book b where id=?1")
     Book1 selectFromId(int id);
}
