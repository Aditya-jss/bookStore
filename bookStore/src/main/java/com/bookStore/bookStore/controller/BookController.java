package com.bookStore.bookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
@GetMapping("/home")
public String home() {
	return "home";
}
@GetMapping("/book_register")
public String bookRegister() {
	return "bookRegister";
}
@GetMapping("/available_books")
public String getAllBook() {
	return "booklist";
}
}
