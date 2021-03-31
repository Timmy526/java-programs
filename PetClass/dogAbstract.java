//Dog Abstract Class File 
//Inheritance & Polymorphism
//Written by Timothy Tu
//October 9 2020
//Language: Java

package PetClass;

public abstract class dogAbstract extends petAbstract {
    public dogAbstract (String name, int age, double weight){
		super(name, age, weight);
	}

	public dogAbstract (String name){
		super(name);
	}
	
	public String getType(){
	    return "Dog";
	}

	public double acepromazine(){
		return (getWeight() / 2.2) * (0.03 / 10);
	}

	public double carprofen(){
		return (getWeight() / 2.2) * (0.5 / 12);
	}
}
