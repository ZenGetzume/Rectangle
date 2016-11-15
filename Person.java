public class Person {
	private String name;
	private int age;
	
	//Constructors
	public Person() {
		name = "Bob";
		age = 25;

	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//getter methods
	public String getName() {
		return name;
	}
	// setter method
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return "person name is " + this.name + " and age is " + this.age;
	}
	}

