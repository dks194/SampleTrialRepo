package assignment_3;

public class ProductDiscount {

	public static int getTotalAmount(int[] itemPrices) {
		int totalAmount = 0;
		for (int i = 0; i < itemPrices.length; i++) {
			totalAmount = totalAmount + itemPrices[i];
		}
		return totalAmount;
	}

	public static boolean isEligibleForDiscount(int totalAmount) {
		return totalAmount > 5000;
	}

	public static int applyDiscount(int totalAmount) {

		int discountedAmount = totalAmount - (totalAmount * 20 / 100);
		return discountedAmount;
	}

	public static void main(String[] args) {
		int[] itemPrices = { 2589, 1254, 12258 };
		int totalAmount = getTotalAmount(itemPrices);

		if (isEligibleForDiscount(totalAmount)) {
			int amtAfterDiscount = applyDiscount(totalAmount);
			System.out.println("The total amount after discount :" + amtAfterDiscount);
			return;
		}
	
		System.out.println("The total amount is :" + totalAmount);

	}

}
