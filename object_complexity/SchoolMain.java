package object_complexity;

public class SchoolMain {
	public static void main(String[] args) {
		Student std = new Student();
		
		std.setFirstName("Shreyash");
		std.setLastName("Sutar");
		std.setEmail("shreyashsutar124@gmail.com");
		std.setMobile("8485898732");
		
		std.setAddress(new Address());
		
		std.getAddress().setStreet1("Shastri Chowk");
		std.getAddress().setStreet2("Aalandi Road");
		std.getAddress().setCity("pune");
		std.getAddress().setState("Maharashtra");
		std.getAddress().setCountry("India");
		
		System.out.println(std);
		
	
	
	
	}

}

//1) Always make Global Variable Private

//2) Access methods by converting variables into getter and setter form within that class

//3) If tooString function didn't called we get Has Value of that particular object

//4) Each and every class extends to the object class you write it or don't as extends object

//5) Here in this particular example to avoid null pointer exception
	//we have used Address class in two ways i.e

		//a) std.setAddress(new Address()); <== in main method
		//b) or set a variable in student class to ==>  private Address address = new Address: