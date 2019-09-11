package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	private String name;
	private int id;
	private String technology;
	@Autowired
	@Qualifier("newLaptop")
	private Laptop newLaptop;

	public Laptop getNewLaptop() {
		return newLaptop;
	}

	public void setNewLaptop(Laptop newLaptop) {
		this.newLaptop = newLaptop;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	void display() {
		System.out.println("Show alien");
		newLaptop.compile();
	}

	public Alien() {}

	public Alien(String name, int id, String technology) {
		super();
		this.name = name;
		this.id = id;
		this.technology = technology;
	}
}
