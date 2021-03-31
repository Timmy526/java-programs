//Cat Test File
//Inheritance & Polymorphism
//Written by Timothy Tu
//October 9 2020
//Language: Java

package PetClass;

public class catTest extends pet{
	public catTest (String name, int age, double weight){
	    super(name, age, weight);
	}

	public catTest (String name){
	    super(name);
	}

	public double acepromazine(){
	    return (getWeight() / 2.2) * (0.02 / 10);
	}

	public double carprofen(){
	    return (getWeight() / 2.2) * (0.25 / 12);
	}

}
