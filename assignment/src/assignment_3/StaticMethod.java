package assignment_3;

public class StaticMethod {

	static String name;
	static int age;
	
	public static void setDetails(String newName,int newAge)
	{
		name = newName;
		age = newAge;
	}
	public static void getDetails()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	public static void main(String[] args) {
		setDetails("Devika",31);
		getDetails();
	}

}
