package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Person> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			String nome = sc.next();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			if (resp == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PhysicalPerson(nome, rendaAnual, gastosSaude));
			} else if (resp == 'c') {
				System.out.print("Number of employees: ");
				int numFuncionarios = sc.nextInt();
				list.add(new PhysicalPerson(nome, rendaAnual, numFuncionarios));
			}
		}
		System.out.println("TAXES PAID:");
		double rendaFinal = 0;
		for (Person person : list) {
			System.out.println(person.getNome() + ": $ " + String.format("%.2f", person.impostoPago()));
			rendaFinal += person.impostoPago();
		}
		System.out.println("TOTAL TAXES: " + String.format("%.2f", rendaFinal));
		
		sc.close();
	}
}
