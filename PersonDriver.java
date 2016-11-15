import java.util.Scanner;

public class PersonDriver {
	public static void main (String[] args) {
	Person hans = new Person();
	System.out.println(hans);
	hans.setName("Hans");
	hans.setAge(21);
	System.out.println(hans.getName());
	System.out.println(hans.getAge());

	Person celeste = new Person("Celeste", 45);

	if(hans.getName().equals(celeste.getName()) && hans.getAge() == celeste.getAge()) {
		System.out.println("Two persons name and age are equal.");
	} else {
		System.out.println("Two Persons name and age are not equal.");
		}


}
}
;
