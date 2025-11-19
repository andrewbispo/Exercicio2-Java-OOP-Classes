package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Employee x = new Employee();

		System.out.print("Name: ");
		x.name = sc.nextLine();
		System.out.println();
		System.out.print("Gross Salary: ");
		x.grossSalary = sc.nextDouble();
		System.out.println();
		System.out.print("Tax: ");
		x.tax = sc.nextDouble();
		System.out.println();

		System.out.println("Employee: " + x);
		System.out.println();
		System.out.print("Wich percentage to increase salary: ");
		double percentage = sc.nextDouble();
		x.increaseSalary(percentage);

		System.out.print("Updated data: " + x);
		System.out.println();
		sc.close();
	}

}
