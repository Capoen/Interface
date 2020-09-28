package model.entities;

public class Invoice {

	// Atributes
	private Double basicPayment;
	private Double tax;

	// Standard Constructor
	public Invoice() {

	}

	// Constructor Using Fields
	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	// Getters and Setters
	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	// Methods
	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
	
}
