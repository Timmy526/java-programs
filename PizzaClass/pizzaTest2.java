//Pizza Test Code 2
//Class Definition
//Written by Timothy Tu
//September 18 2020
//Language: Java

package PizzaClass;
import java.util.Scanner;

public class pizzaTest2 {
	public static void main(String [] args) {
		pizza pizza1 = new pizza("Large", 1, 0, 1); //create a large pizza with 1 cheese and 1 ham
        pizza pizza2 = new pizza("Medium", 2, 2, 0); //create a medium pizza with 2 cheese and 2 pep

        pizzaOrder order = new pizzaOrder(2); //create an order with 2 pizzas

        order.setNumPizzas(2);
        order.setPizza1(pizza1);
        order.setPizza2(pizza2);

        double total = order.calcTotal();
        System.out.printf("Total: $%.2f%n", total);
			
		return;
			
	}
	
}

