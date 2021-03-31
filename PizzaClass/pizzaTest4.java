//Pizza Test Code 4
//Arrays
//Written by Timothy Tu
//October 2 2020
//Language: Java

package PizzaClass;

public class pizzaTest4 {
    public static void main(String[] args){
    pizza pizza1 = new pizza("Large", 1, 0, 1); //Large, 1 cheese, 1 ham
    pizza pizza2 = new pizza("Medium", 1, 1, 0); //Medium, 2 cheese, 2 pepperoni

    pizzaOrder2 order1 = new pizzaOrder2(2);
    order1.setNumPizzas(2);
    order1.setPizza(pizza1); 
    order1.setPizza(pizza2);
    
    pizzaOrder2 order2 = new pizzaOrder2(order1);

    order2.getPizza(1).setCheese(3);
    System.out.println("Order 1 Pizzas:");
    System.out.println("Pizza 1:\n" + order1.getPizza(0).getDescription());
    System.out.println("Pizza 2:\n" + order1.getPizza(1).getDescription());
    System.out.printf("Total order 1: $%.2f%n%n%n", order1.calcTotal());
    
    System.out.println("Order 2 Pizzas:");
    System.out.println("Pizza 1:\n" + order2.getPizza(0).getDescription());
    System.out.println("Pizza 2:\n" + order2.getPizza(1).getDescription());
    System.out.printf("Total order 2: $%.2f%n%n%n", order2.calcTotal());
    }
}
