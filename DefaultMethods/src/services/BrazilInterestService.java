package services;

public class BrazilInterestService implements InterestService {

	private Double interestRate;

	public BrazilInterestService() {
	}

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public Double getInterestRate() {
		return interestRate;
	}

}
