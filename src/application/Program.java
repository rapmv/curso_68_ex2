package application;

import java.util.Locale;
import java.util.Scanner;

import ententies.Salary;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salary salary = new Salary();
		
		System.out.print("Name: ");
		salary.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		salary.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		salary.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: "+salary.name+", $ "+String.format("%.2f", salary.netSalary()));
		
		System.out.println();
		System.out.print("Which percentage to increase salary: ");
		double percent = sc.nextDouble();
		salary.incressSalary(percent);
		
		System.out.println();
		System.out.print("Updated data: "+ salary.name+ ", $ "+ String.format("%.2f", salary.netSalary()));
		
		
		sc.close();
	}

}
