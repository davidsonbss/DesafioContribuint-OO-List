package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> listTaxPayer = new ArrayList<>();
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int numberTaxPayer = sc.nextInt();
		
		for(int i=0; i< numberTaxPayer; i++) {
			System.out.println();
			System.out.println("Digite os dados do " + (i+1) + "° contribuinte: ");
			System.out.print("Renda anual com salário: ");
			Double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			Double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			Double capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			Double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			Double educationSpending = sc.nextDouble();
			
			listTaxPayer.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending));
						
		}
		
		System.out.println();
		
		for(int i=0; i < listTaxPayer.size();i++) {
			System.out.println("Resumo do " + (i+1) + "° contribuinte:");
			System.out.println(listTaxPayer.get(i));
		}
		
		/*
		int i = 0;
		for (TaxPayer x : listTaxPayer) {
			i++;
			System.out.println("Resumo do " + (i) + "° contribuinte:");
			System.out.println(x);
		}
		 */
		sc.close();
	}
}
