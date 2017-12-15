package pl.coderslab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.coderslab.bean.MemoryBookService;
import pl.coderslab.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	MemoryBookService mbs;

	@RequestMapping("/hello")
	public String hello() {
		return "{hello:	World}";
	}

	@RequestMapping("/helloBook")
	public Book helloBook() {
		return new Book(1L, "9788324631766", "Thiniking in Java", "Bruce Eckel", "Helion", "programming");
	}
	
	@GetMapping("/")
	public List<Book> getBooks() {
		return this.mbs.getList();
	}
}
