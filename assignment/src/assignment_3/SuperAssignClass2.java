package assignment_3;

public class SuperAssignClass2 extends SuperAssign{
	
	public void isDivisible() {
		int result = super.sum(20, 10);
		if(result % 10 ==0) {
			System.out.println("The number "+result+" is divisible by 10");
		}
		else {
			System.out.println("Not divisible by 10");
		}
				
	}

	public static void main(String[] args) {
		SuperAssignClass2 obj = new SuperAssignClass2();
		obj.isDivisible();

	}

}
