package fr.dawan.interf_task2;

public class Product {
	
	private int id;
	private String description;
	private double price;
	
	public Product(int id, String description, double price) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	

}
