package com.example.demo;

import org.springframework.stereotype.Component;

@Component("newLaptop")
public class Laptop {
	
	private int laptopId;
	private String brand;
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Laptop() {}
	
	public Laptop(int id, String brand) {
		this.laptopId = id;
		this.brand = brand;
	}
	
	public void compile() {
		System.out.println("Run Compiler");
	}

}
