package assignment_3;

public class Palindrome {

	public static int reverseNumber(int number) {
		int reverse = 0;
		while (number > 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		return reverse;
	}

	public static void IsPalindrome(int number,int reverse) {
		if(number == reverse) {
			System.out.println("The number is a palindrom");
		}
		else {
			System.out.println("The number is not a palindrom");
		}
			
	}

	public static void main(String[] args) {
		int number = 121;
		int reverse=reverseNumber(number);
		System.out.println("The reverse of the number " + number + " is " + reverse);
		IsPalindrome(number,reverse);
	}

}
