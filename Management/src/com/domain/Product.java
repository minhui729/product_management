package com.domain;

public class Product {
	private int id;
	private String name;
	private double price;
	private int quantity;
	private String category;
	
	public Product() {}
	public Product(int id, String name, double price, int quantity, String category) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
	}
	
	public int getId() { return id; }
	public String getName() { return name; } 
	public double getPrice() { return price; } 
	public int getQuantity() { return quantity; } 
	public String getCategory() { return category; } 
	
	public void setId(int id) { this.id = id; }
	public void setName(String name) { this.name = name; }
	public void setPrice(double price) { this.price = price; }
	public void setQuantity(int quantity) { this.quantity = quantity; }
	public void setCategory(String category) { this.category = category; }
	
	@Override
	public String toString() {
		return "Product { " + "id = " + id + ", " +  
	}
}
