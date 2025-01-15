package assignment_3;

public class SalarySlip extends EmployeeTotalSalary {

	public static void main(String[] args) {
		SalarySlip ssp = new SalarySlip();
		System.out.println("Basic pay : " + ssp.basicPay);
		System.out.println("Deduction : "+ssp.deduction);
		System.out.println("Bonus : "+ssp.bonus);
		System.out.println("HRA : "+ssp.hra);
		System.out.println("PF : "+ssp.pf);
		System.out.println("Total Salary : "+ssp.totalSalary);

	}

}
