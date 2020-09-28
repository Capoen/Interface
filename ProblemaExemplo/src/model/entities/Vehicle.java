package model.entities;

public class Vehicle {

	// Atributes
	private String model;

	// Standard Constructor
	public Vehicle() {

	}

	// Constructor Using Fields
	public Vehicle(String model) {
		this.model = model;
	}

	// Getters and Setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
