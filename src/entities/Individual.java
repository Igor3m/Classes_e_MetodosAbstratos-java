package entities;

public class Individual extends TaxPayer {

	private double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String nome, double annualIncome, double healthExpenditures) {
		super(nome, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double valorImposto;
		if (annualIncome < 20000.00) {
			valorImposto = (annualIncome * 0.15) - (healthExpenditures * 0.50);
			return valorImposto;
		}
		else {
			valorImposto = (annualIncome * 0.25) - (healthExpenditures * 0.50);
			return valorImposto;
		}
	}

	@Override
	public String toString() {
		return nome + ": $ " + tax();
	}
	
	

}
