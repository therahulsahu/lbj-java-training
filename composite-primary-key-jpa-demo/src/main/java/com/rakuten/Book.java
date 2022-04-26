package com.rakuten;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
	@EmbeddedId
	private BookIdentity bookIdentity;
	private String bookName;
	private String authorName;
	
	public Book(BookIdentity bookIdentity, String bookName, String authorName) {
		super();
		this.bookIdentity = bookIdentity;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	public Book() {
		super();
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
}
