import abstractsample.Cat;
import abstractsample.Dog;

public class Main {

	public static void main(String[] args) {
		System.out.println("Abstraction using abstract class");
		Dog dog = new Dog();
		dog.speak();

		Cat cat = new Cat();
		cat.speak();

		System.out.println("Abstraction using interface");
		interfacesample.Dog dog1 = new interfacesample.Dog();
		dog1.speak();

		interfacesample.Cat cat1 = new interfacesample.Cat();
		cat1.speak();
	}

}