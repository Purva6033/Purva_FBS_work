class Animal{
	String name;
	int age;
}
class Cat extends Animal{
	String Breed;
}
class Dog extends Animal{
	int Height;
}
 class TestAnimal {
public static void main(String[] args) {
	Cat c = new Cat();
	c.name="chiu";
	Dog d = new Dog();
	d.name="moti";
	
	System.out.println("\nAnimal Hierarchy");
	System.out.println(c.name);
	System.out.println(d.name);
	
}
}
