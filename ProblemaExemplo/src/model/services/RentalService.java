package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	// Atributes
	private Double pricePerDay;
	private Double pricePerHour;

	private TaxService taxService;

	// Standard Constructor
	public RentalService() {

	}

	// Constructor Using Fields
	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}


	// Methods
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();

		Double hours = (double) (t2 - t1) / 1000 / 60 / 60;

		double basicPayment;

		if (hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		} else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;
		}

		Double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));

	}

}
