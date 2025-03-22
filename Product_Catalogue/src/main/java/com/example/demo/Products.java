package com.example.demo;

public class Products {
	public Products(String name, String description, String image_url, int price) {
		super();
		this.name = name;
		this.description = description;
		this.image_url = image_url;
		this.price = price;
	}
	private String name,description,image_url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return image_url;
	}
	public void setUrl(String url) {
		this.image_url = url;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int price;
}
