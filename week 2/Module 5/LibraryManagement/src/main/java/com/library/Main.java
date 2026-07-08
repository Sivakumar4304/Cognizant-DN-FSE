package com.library;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //BookService service = context.getBean("bookService", BookService.class);
        BookService service = context.getBean("BookService", BookService.class);
        service.display();

//        BookRepository reposit=context.getBean("BookRepository",BookRepository.class);
//        reposit.saveBook();
    }
}