package entities;

public class Company extends TaxPayer {

	private int numberOfEmployees;
		
	public Company() {
		super();
	}

	public Company(String nome, double annualIncome, int numberOfEmployees) {
		super(nome, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double valorImposto;
		if (numberOfEmployees > 10) {
			valorImposto = annualIncome * 0.14;
			return valorImposto;
		}
		else {
			valorImposto = annualIncome * 0.16;
			return valorImposto;
		}
	}

	@Override
	public String toString() {
		return nome + ": $ " + tax();
	}

}
