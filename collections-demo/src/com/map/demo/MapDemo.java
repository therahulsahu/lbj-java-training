package com.map.demo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Book> books = new HashMap<>();
		
		for(int i = 0; i < 20; ++i) {
			Book book = new Book("title" + i, (float) Math.random() * 1000);
			books.put("book" + i, book);
		}
		
		System.out.println(books);
	}

}
