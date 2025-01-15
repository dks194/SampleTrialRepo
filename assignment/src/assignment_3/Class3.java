package assignment_3;

public class Class3 extends Class2 {

	public double totalSalary() {
		double total = basicPay+hra()-pf()-deduction+bonus;
		return total;
	}	
}
