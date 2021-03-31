//Dog Test File
//Inheritance & Polymorphism
//Written by Timothy Tu
//October 9 2020
//Language: Java

package PetClass;

public class dogTest extends pet {
	public dogTest (String name, int age, double weight){
		super(name, age, weight);
	}

	public dogTest (String name){
		super(name);
	}

	public double acepromazine(){
		return (getWeight() / 2.2) * (0.03 / 10);
	}

	public double carprofen(){
		return (getWeight() / 2.2) * (0.5 / 12);
	}

}
