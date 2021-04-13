package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer # " + i + " data: ");
			System.out.print("Individual or company (i/c)?");
			char tipo = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			if(tipo == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				list.add(new Individual(nome, rendaAnual, gastosSaude));
			}
			else {
				System.out.print("Number of employees: ");
				int quantFuncionarios = sc.nextInt();
				list.add(new Company(nome, rendaAnual, quantFuncionarios));
			}
		}
		
		System.out.println();
		double soma = 0.0;
		
		System.out.println("TAXES PAID: ");
		for(TaxPayer x : list) {
			soma += x.tax();
			System.out.println(x.toString());
		}
		
		System.out.print("TOTAL TAXES: ");
		System.out.println(soma);
		
		sc.close();
	}

}
