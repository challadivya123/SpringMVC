package com.hcl.library.entity;

public class Book {
private int bokId;
private String bname;
private String author;
private float price;
public Book() {
	super();
	this.bokId = bokId;
	this.bname = bname;
	this.author = author;
	this.price = price;
}
 
public int getBokId() {
	return bokId;
}
public void setBokId(int bokId) {
	this.bokId = bokId;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}

}
