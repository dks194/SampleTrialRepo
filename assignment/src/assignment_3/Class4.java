package assignment_3;

public class Class4 extends Class3 {
	

	public static void main(String[] args) {
		Class4 obj = new Class4();
		//obj.meth();
		System.out.println("Basic pay: " + obj.basicPay);
		System.out.println("Deduction: " + obj.deduction);
		System.out.println("Bonus: " + obj.bonus);
		System.out.println("HRA: " +obj.hra());
		System.out.println("pf: "+obj.pf());
		System.out.println("TotalSalary: "+obj.totalSalary());

	}

}
