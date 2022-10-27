package entity;

public class Person {

	private String name;

	private Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name = " + name + ",age = " + age;
	}

}
