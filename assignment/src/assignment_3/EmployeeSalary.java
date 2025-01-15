package assignment_3;

import java.util.Scanner;

public class EmployeeSalary {
	double basicPay;
	double deduction;
	double bonus;

	public EmployeeSalary() {
		try (Scanner scanner = new Scanner(System.in)) {
			basicPay = getSalaryComponentFromConsole("Enter basic salary\n", scanner);
			deduction = getSalaryComponentFromConsole("Enter deduction\n", scanner);
			bonus = getSalaryComponentFromConsole("Enter bonus\n", scanner);
		}
	}

	public double getSalaryComponentFromConsole(String inputMessage, Scanner scanner) {
		System.out.println(inputMessage);
		return scanner.nextDouble();

	}

}
