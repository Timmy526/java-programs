//Pet Abstract Class File 
//Inheritance & Polymorphism
//Written by Timothy Tu
//October 9 2020
//Language: Java

package PetClass;

public abstract class petAbstract {
    private String myName;
	private int myAge;
	private double myWeight;

	public petAbstract(String name, int age, double weight){
		if (age < 0){
			System.out.println("Can not have a negative age or weight");
			System.exit(0);
		}
		setName(name);
		setAge(age);
		setWeight(weight);
	}

	public petAbstract(String name){
		setName(name);
		setAge(0);
		setWeight(0.0);
	}

	public String getName(){
		return myName;
	}

	public void setName(String name){
		myName = name;
		return;
	}
		
	public int getAge(){
		return myAge;
	}

	public void setAge(int age){
		if (age >= 0) {
			myAge = age;
		}
		else {
			System.out.println("ERROR: Negative age. Age not set.");
		}
		return;
	}

	public double getWeight(){
		return myWeight;
	}

	public void setWeight(double weight){
		if (weight >= 0) {
			myWeight = weight;
		}
		else {
			System.out.println("ERROR: Negative weight. Weight not set.");
		}
		return;
	}

	public abstract String getType();
	
	public void printData(){
		System.out.printf("Name: %s\nAge: %d years\nWeight: %.2f pounds\n", getName(), getAge(), getWeight());
		System.out.printf("Pet Type: %s\n", getType());
		System.out.printf("%s needs %.3f ml of Acepromazine\n", acepromazine());
		System.out.printf("%s needs %.3f ml of Carprofen\n\n", carprofen());
		return;
	}

	public abstract double acepromazine();

	public abstract double carprofen();
}
