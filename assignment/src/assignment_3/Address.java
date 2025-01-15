package assignment_3;

public class Address {
	String address;
	Student details;

	public Address(String address, Student details) {
		this.address = address;
		this.details = details;
	}

	public void displayDetails() {
		System.out.println(
				"Student Name: " + details.name + "\n" + "Roll No: " + details.rollNum + "\n" + "Address: " + address);
	}

	public static void main(String[] args) {
		Student student = new Student("Devika", 8);
		Address address = new Address("Alaska 7b", student);
		address.displayDetails();

	}

}
