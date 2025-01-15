package assignment_3;

public class EmployeeTotalSalary extends EmployeeAddSalary {
	double totalSalary;

	public EmployeeTotalSalary() {
		this.totalSalary = calculateTotalSalary();
	}

	public double calculateTotalSalary() {
		double totalSalary = this.basicPay + this.hra - this.pf - this.deduction + this.bonus;

		return totalSalary;
	}
	

}
