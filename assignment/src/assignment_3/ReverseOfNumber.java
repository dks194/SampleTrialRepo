package assignment_3;

public class ReverseOfNumber {
	
	public static int reverseNum(int number) {
		int reverse =0;
		while(number > 0) {
			reverse = reverse*10 +number%10;
			number = number/10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		int number = 12365;
		int reverse=reverseNum(number);
		System.out.println("The reverse of the number "+number+" is "+reverse);

	}

}
