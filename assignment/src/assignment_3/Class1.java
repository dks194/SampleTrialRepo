package assignment_3;

import java.util.Scanner;

public class Class1 {

	double basicPay;
	double deduction;
	double bonus;

//	public void meth() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Basic Pay: ");
//		basicPay = sc.nextDouble();
//
//		System.out.print("Enter deduction amount : ");
//		deduction = sc.nextDouble();
//
//		System.out.print("Enter bonus: ");
//		bonus = sc.nextDouble();
//		sc.close();
//	}
	public Class1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Basic Pay: ");
		basicPay = sc.nextDouble();

		System.out.print("Enter deduction amount : ");
		deduction = sc.nextDouble();

		System.out.print("Enter bonus: ");
		bonus = sc.nextDouble();
		sc.close();
	}

}
