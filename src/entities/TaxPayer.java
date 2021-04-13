package entities;

public abstract class TaxPayer {
	
	protected String nome;
	protected double annualIncome;
	
	public TaxPayer() {
	}
	
	public TaxPayer(String nome, double annualIncome) {
		this.nome = nome;
		this.annualIncome = annualIncome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public abstract double tax();

}
