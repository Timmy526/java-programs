//Cat Abstract Class File 
//Inheritance & Polymorphism
//Written by Timothy Tu
//October 9 2020
//Language: Java

package PetClass;

public abstract class catAbstract extends petAbstract {
    public catAbstract (String name, int age, double weight){
	    super(name, age, weight);
	}

	public catAbstract (String name){
	    super(name);
	}

	public String getType(){
	    return "Cat";
	}
	
	public double acepromazine(){
	    return (getWeight() / 2.2) * (0.02 / 10);
	}

	public double carprofen(){
	    return (getWeight() / 2.2) * (0.25 / 12);
	}
}
