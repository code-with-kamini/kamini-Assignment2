package assignment2;

public class Person {
	
	String name;
	int age;
	
	public void display() {
		
		name ="Pankaj";
		age=30;
		
		System.out.println("Name :" +name);
		System.out.println("Age :" +age);
		
	}

	public static void main(String[] args) {
	
		Person P = new Person();
	    P.display();

	}

}
