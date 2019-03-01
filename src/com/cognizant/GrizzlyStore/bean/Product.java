package com.cognizant.GrizzlyStore.bean;

public class Product {
	
	
	private String productId;
	private String category;
	private String name;
	private String description;
	private float price;
	private String brand;
	private String rating;
	
	public Product( String name, String brand,String category,String rating) {
		super();
		
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.rating=rating;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	

}
