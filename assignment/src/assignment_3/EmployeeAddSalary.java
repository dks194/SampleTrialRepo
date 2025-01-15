package assignment_3;

public class EmployeeAddSalary extends EmployeeSalary {

	double hra;
	double pf;

	public EmployeeAddSalary() {
		this.hra = calculateHra();
		this.pf = calculatePf();
	}

	public double calculateHra() {

		double hra = 0.05 * this.basicPay;
		return hra;

	}

	public double calculatePf() {
		double pf = 0.20 * this.basicPay;
		return pf;
	}

}
