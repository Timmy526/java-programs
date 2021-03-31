//Pizza Test Code 1
//Class Definition
//Written by Timothy Tu
//September 18 2020
//Language: Java

package PizzaClass;
import java.util.Scanner;

public class pizzaTest1 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int numPizzas = 0;
		int i = 0;
		String description = " ";
		
		System.out.println("Enter the number of pizzas being ordered: ");
		numPizzas = input.nextInt();
		
		pizza[] allPizzas = new pizza[numPizzas];
		
		for (i = 0; i < numPizzas; i++) {
			System.out.println("Customization for Pizza number " + (i + 1) + " starting now.");
			allPizzas[i] = new pizza();
			getPizza(allPizzas[i]);
		}
		
		for (i = 0; i < numPizzas; i++) {
			System.out.println("Pizza number " + (i + 1) + " has the following: ");
			System.out.println(allPizzas[i].getDescription());
		}
		
		return;
		
	}
	
	public static void getPizza(pizza thisPizza) {
		Scanner input = new Scanner(System.in);
		String size = " ";
		int cheese = 0;
		int pepperoni = 0;
		int ham = 0;
		
		System.out.println("Enter size of the pizza (Small, Medium or Large)");
		size = input.nextLine();
		
		System.out.println("Enter amount of cheese topping (Up to 10)");
		cheese = input.nextInt();
		
		System.out.println("Enter amount of pepperoni topping (Up to 10)");
		pepperoni = input.nextInt();
		
		System.out.println("Enter amount of ham topping (Up to 10)");
		ham = input.nextInt();
		
		System.out.println();
		
		thisPizza.setSize(size);
		thisPizza.setCheese(cheese);
		thisPizza.setPepperoni(pepperoni);
		thisPizza.setHam(ham);
	}
}
