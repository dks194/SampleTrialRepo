package assignment_3;

public class OffSeason {
	public void discount(double price) {
		price = price-price*0.15;
		System.out.println("Price in offseason: "+price);
	}
	
	

	public static void main(String[] args) {
		OffSeason off = new OffSeason();
		off.discount(1000);
		
		OnSeason on = new OnSeason();
		on.discount(1000);

	}
}
