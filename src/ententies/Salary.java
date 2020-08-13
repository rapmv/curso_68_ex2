package ententies;

public class Salary {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void incressSalary(double percent) {
		grossSalary=grossSalary+(grossSalary*(percent/100));
	}
}
