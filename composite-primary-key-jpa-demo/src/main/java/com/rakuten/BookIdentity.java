package com.rakuten;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class BookIdentity implements Serializable {
	
	private String bookId;
	private String authorID;
	
	public BookIdentity() {
		super();
	}
	
	public BookIdentity(String bookId, String authorId) {
		super();
		this.bookId = bookId;
		this.authorID = authorId;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getAuthorId() {
		return authorID;
	}
	public void setAuthorId(String authorId) {
		this.authorID = authorId;
	}
}
